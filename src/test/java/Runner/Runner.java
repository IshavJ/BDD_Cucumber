package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FlipkartApp.feature"
        ,glue={"Steps","Drivers"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
//        tags = "@App",
        monochrome = true
)

public class Runner {
    //"junit:test-Output/cucumber-reports/Cucumber.xml"
    //"html:test-Output/cucumber-report.html","pretty","json:test-Output/Cucumber.json",
}
