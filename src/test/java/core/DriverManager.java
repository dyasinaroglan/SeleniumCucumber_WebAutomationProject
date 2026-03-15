package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverManager {

    private static final Logger log = LoggerFactory.getLogger(DriverManager.class);
    public static WebDriver driver;


    public static void startDriver(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--start-maximized");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(chromeOptions);
        log.info("browser ayağa kalktı.");

    }
    public static void closeDriver(){
        driver.quit();

    }
}
