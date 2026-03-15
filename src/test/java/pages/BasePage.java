package pages;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected void navigateTo(String url){
        DriverManager.driver.get(url);
    }

    protected void clickTo(By locator){
        WebDriverWait wait = new WebDriverWait(DriverManager.driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    protected String getAnaUrl(){
        return DriverManager.driver.getCurrentUrl();
    }

}
