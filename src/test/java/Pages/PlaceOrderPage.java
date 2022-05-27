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

public class PlaceOrderPage {
    static WebDriverWait w;
    public static void placeOrder() throws IOException {
        PropertiesFetch.prop();
        w = new WebDriverWait(driver, Duration.ofMillis(4000));
        WebElement item = w.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(PropertiesFetch.PlaceOrder)));
        Assert.assertTrue(item.isDisplayed(),"Button Not Displayed");
        item.click();
    }

    public static void totalAmount() throws IOException {
        PropertiesFetch.prop();
        w = new WebDriverWait(driver, Duration.ofMillis(3000));
        WebElement item = w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(PropertiesFetch.totalCash)));
        Assert.assertTrue(item.isDisplayed(),"Total cash Not Visible");
    }
}
