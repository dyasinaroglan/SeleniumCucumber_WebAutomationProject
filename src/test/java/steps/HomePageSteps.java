package steps;

import core.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

public class HomePageSteps {

    private static final Logger log = LoggerFactory.getLogger(HomePageSteps.class);

    String tempData;

    @Given("{string} hesapkurdu ana sayfasına gidilir")
    public void goToSite(String url) {
        DriverManager.setupDriver();
        DriverManager.driver.get(url);
        log.info(url + " sayfasına yönlendiriliyor.");

    }

    @When("ihtiyaç kredisi butonuna tıklanır")
    public void ihtiyaçKredisiButonunaTıklanır() {

        tempData = DriverManager.driver.getWindowHandle();
        DriverManager.driver.findElement(By.xpath("//div[@class='Container_innerContainer__nz5R5 Hero_features__IiWyG relative']//a[contains(text(), 'İhtiyaç Kredisi') and @href='/ihtiyac-kredisi']")).click();
    }

    @Then("İhtiyaç kredisi gidildiği kontrol edilir")
    public void i̇htiyaçKredisiGidildiğiKontrolEdilir() throws InterruptedException {

        Thread.sleep(2000);
        Set<String> handles = DriverManager.driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(tempData)) {
                DriverManager.driver.switchTo().window(handle);
            }
        }
        String actualUrl = DriverManager.driver.getCurrentUrl();
        Assert.assertEquals("https://www.hesapkurdu.com/ihtiyac-kredisi",actualUrl);
        log.info(actualUrl + " sayfasına gidildi.");
    }

    @Then("Tarayıcı kapatılır.")
    public void tarayiciKapatlir() {
        DriverManager.quitDriver();
    }
}
