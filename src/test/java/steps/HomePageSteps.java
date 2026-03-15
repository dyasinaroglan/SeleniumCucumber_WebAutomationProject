package steps;

import core.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;
import pages.HomePage;

import java.util.Set;

public class HomePageSteps {

    private static final Logger log = LoggerFactory.getLogger(HomePageSteps.class);
    HomePage homePage = new HomePage();

    @Given("Hesapkurdu ana sayfasına gidilir")
    public void anaSayfayaGider() {
        homePage.goToSite();
    }

    @When("ihtiyaç kredisi butonuna tıklanır")
    public void ihtiyacKredisiButonunaTiklanir() {
        homePage.saveCurrentHandle();
        homePage.ihtiyacKredisiButtonClick();
        homePage.getCurrentUrl();

    }
}
