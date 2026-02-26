package hooks;

import core.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import steps.HomePageSteps;

public class Hooks {

    private static final Logger log = LoggerFactory.getLogger(HomePageSteps.class);

    @Before
    public void setupDriver(Scenario scenario) {
        DriverManager.startDriver();
        log.info("Senaryo adı : " + scenario.getName());
        log.info("Senaryo Tags : " + scenario.getSourceTagNames());
        log.info("browser ayağa kalktı.");
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) DriverManager.driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

            log.info("Screenshot alındı : " + scenario.getName());
        }
        DriverManager.closeDriver();
    }
}
