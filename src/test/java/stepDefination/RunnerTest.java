package stepDefination;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\HP\\IdeaProjects\\CucumberFramework\\Features" ,glue={"stepDefination"},
monochrome = true ,
     plugin =   {"pretty","html:target/htmlReports"})

public class RunnerTest {
}
