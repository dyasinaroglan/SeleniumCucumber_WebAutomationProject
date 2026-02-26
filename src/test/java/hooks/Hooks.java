package hooks;

import core.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import steps.HomePageSteps;

public class Hooks {

    private static final Logger log = LoggerFactory.getLogger(HomePageSteps.class);

    @Before
    public void setupDriver(){
        DriverManager.startDriver();
        log.info("browser ayağa kalktı.");
    }

    @After
    public void quitDriver(){
        DriverManager.closeDriver();
        log.info("Browser kapatıldı.");
    }
}
