package core;

import hooks.Hooks;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverManager {

    private static final Logger log = LoggerFactory.getLogger(DriverManager.class);
    public static WebDriver driver;

    public static void startDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        log.info("browser ayağa kalktı.");

    }
    public static void closeDriver(){
        driver.quit();

    }


}
