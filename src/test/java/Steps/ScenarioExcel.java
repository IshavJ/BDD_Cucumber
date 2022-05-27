package Steps;

import Pages.HomePage;
import Pages.ResultPage;
import drivers.Driver;
import drivers.ExcelReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ScenarioExcel {
    public String data;

    @When("user enter the text with {string} and {int}")
    public void user_enter_the_text_with_and_row_num(String string, Integer i) throws IOException, InvalidFormatException {
        HomePage.popupClear();

        //Excel Reading
        ExcelReader reader = new ExcelReader();
        List<Map<String, String>> testData =
                reader.getData("src/test/resources/TstData.xlsx", string);

        data = testData.get(i).get("Data");

        HomePage.SearchBarTxt(data);
    }

    @When("click on button")
    public void click_on_button() throws IOException {
        HomePage.SearchButtonClick();
    }

    @Then("verify title")
    public void verify_title() {
        String title = ResultPage.CheckHead("//span[text()='"+ data+"']");
        Assert.assertEquals(title,data,"Span are not Equal");

        Driver.close();
    }

}
