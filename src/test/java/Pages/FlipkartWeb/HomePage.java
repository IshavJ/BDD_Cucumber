package Pages.FlipkartWeb;

import Drivers.PropertiesFetch;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.io.IOException;

import static Drivers.Driver.*;

public class HomePage {
    public static void popupClear() throws IOException {
        //test = extent.createTest("Closing Popup button","closing the login popup");
        PropertiesFetch.prop();
        WebDriverWait w= new WebDriverWait(driver, 50);
        WebElement x = w.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(PropertiesFetch.popup)));
        x.click();

    }

    public static void searchBarTxt(String s) throws IOException {
        //test = extent.createTest("Sending data to search bar","Inputting data to the search bar");
        PropertiesFetch.prop();
        WebElement item = driver.findElement(By.xpath(PropertiesFetch.searchbar));
        Assert.assertTrue(item.isDisplayed(), "Not Visible");
        item.sendKeys(s);
    }

    public static void searchButtonClick() throws IOException {
        //test = extent.createTest("Clicking search button","pressing button");
        PropertiesFetch.prop();
        driver.findElement(By.tagName(PropertiesFetch.searchButton)).click();
    }
}
