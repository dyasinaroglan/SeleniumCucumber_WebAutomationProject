package steps;

import core.DriverManager;
import io.cucumber.java.en.Given;

public class HomePageSteps {

    @Given("{string} hesapkurdu ana sayfasına gidilir")
    public void goToSite(String url) {
        DriverManager.setupDriver();
        DriverManager.driver.get(url);

    }
}
