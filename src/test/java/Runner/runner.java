package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Flipkart.feature"
        ,glue={"Steps"}
        ,plugin = {"pretty","html:test-op/flipkart_report.html"} )
public class runner {
}
