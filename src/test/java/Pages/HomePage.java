package Pages;

import drivers.PropertiesFetch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;

import static drivers.Driver.driver;


public class HomePage {
    public static void popupClear() throws IOException {
        PropertiesFetch.prop();
        driver.findElement(By.cssSelector(PropertiesFetch.popup)).click();
    }

    public static void SearchBarTxt(String s) throws IOException {
        PropertiesFetch.prop();
        WebElement item = driver.findElement(By.cssSelector(PropertiesFetch.searchbar));
        Assert.assertTrue(item.isDisplayed(), "Not Visible");
        item.sendKeys(s);
    }

    public static void SearchButtonClick() throws IOException {
        PropertiesFetch.prop();
        driver.findElement(By.tagName(PropertiesFetch.searchButton)).click();
    }
}
