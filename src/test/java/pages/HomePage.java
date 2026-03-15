package pages;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

public class HomePage extends BasePage{

    private String tempData;

    private static final Logger log = LoggerFactory.getLogger(HomePage.class);
    private final String url = "https://www.hesapkurdu.com/";
    private final By ihtiyacKredisiButton = By.xpath("//div[contains(@class,'Hero_features')]//a[@href='/ihtiyac-kredisi']");

    public void goToSite(){
        navigateTo(url);
        log.info(url + " sayfasına gidilir.");

    }

    public void ihtiyacKredisiButtonClick(){
        clickTo(ihtiyacKredisiButton);
    }

    public void saveCurrentHandle() {
        tempData = DriverManager.driver.getWindowHandle();
    }

    public void switchToNewTab(){
        Set<String> handles = DriverManager.driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(tempData)) {
                DriverManager.driver.switchTo().window(handle);
            }
        }
    }
    public void getCurrentUrl(){
        getAnaUrl();
    }
}
