package Pages.FlipkartWeb;

import Drivers.PropertiesFetch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.io.IOException;
import java.time.Duration;

import static Drivers.Driver.driver;

public class AuthenticationPage {
    public static void continueButton() throws IOException {
        PropertiesFetch.prop();
        WebDriverWait w = new WebDriverWait(driver,10);
        WebElement item = w.until(ExpectedConditions.presenceOfElementLocated(By.tagName(PropertiesFetch.continueButton)));
        Assert.assertTrue(item.isDisplayed(),"Button not visible");
    }
}
