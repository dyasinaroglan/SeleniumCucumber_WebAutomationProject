package steps;

import core.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.HomePage;

import java.util.Set;

public class HomePageSteps {

    private static final Logger log = LoggerFactory.getLogger(HomePageSteps.class);

    String tempData;
    HomePage homePage = new HomePage();

    @Given("{string} hesapkurdu ana sayfasına gidilir")
    public void anaSayfayaGider() {
        homePage.goToSite();

    }

    @When("ihtiyaç kredisi butonuna tıklanır")
    public void ihtiyacKredisiButonunaTiklanir() {

        homePage.pageHandleTake();
        homePage.ihtiyacKredisiButtonClick();

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
        Assert.assertEquals("https://www.hesapkurdu.com/ihtiyac-kredisi", actualUrl);
        log.info(actualUrl + " sayfasına gidildi.");
    }
}
