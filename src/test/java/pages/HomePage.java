package pages;

import core.DriverManager;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage {

    private static final Logger log = LoggerFactory.getLogger(HomePage.class);
    private final String url = "https://www.hesapkurdu.com/";
    private final By ihtiyacKredisiButton = By.xpath("//div[contains(@class,'Hero_features')]//a[@href='/ihtiyac-kredisi']");

    public void goToSite(){
        DriverManager.driver.get(url);
        log.info(url + " sayfasına gidilir.");
    }
    public void pageHandleTake(){
        DriverManager.driver.getWindowHandle();

    }

    public void ihtiyacKredisiButtonClick(){
        DriverManager.driver.findElement(ihtiyacKredisiButton).click();
    }
}
