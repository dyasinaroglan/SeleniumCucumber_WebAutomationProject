package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public static WebDriver driver;

    public static void setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


}
