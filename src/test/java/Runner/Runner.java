package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Flipkart.feature"
        ,glue={"Steps"}
        ,plugin = {"pretty","html:test-op/flipkart_report.html"} )
public class Runner extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = true)
    public Object[][] x(){
        return super.scenarios();
    }
}
