package Pages;

import drivers.PropertiesFetch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;

import static drivers.Driver.driver;


public class HomePage {
    public static void popupClear() throws IOException {
        PropertiesFetch.prop();
        WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(10000));
        w.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector(PropertiesFetch.popup)))));
        driver.findElement(By.cssSelector(PropertiesFetch.popup)).click();
    }

    public static void SearchBarTxt(String s) throws IOException {
        PropertiesFetch.prop();
        WebElement item = driver.findElement(By.xpath(PropertiesFetch.searchbar));
        Assert.assertTrue(item.isDisplayed(), "Not Visible");
        item.sendKeys(s);
    }

    public static void SearchButtonClick() throws IOException {
        PropertiesFetch.prop();
        driver.findElement(By.tagName(PropertiesFetch.searchButton)).click();
    }
}
