package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // senaryolar nerede?
        glue = {"steps","hooks"}, //adımların nerede?
        plugin = "pretty", // nasıl bir rapor, çıktı almak istiyorsun
        tags = "@yaso1" // hangi test senaryolarını çalıştırmak istiyorsun?e
)

public class RunnerTest {

}




