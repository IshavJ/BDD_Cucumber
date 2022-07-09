package Pages.FlipkartApp;

import Drivers.PropertiesFetch;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static Drivers.Driver.*;

public class Page6 {
    public static void verifyTotal(){
        wait = new WebDriverWait(Driver,20);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertiesFetch.Price)));
        Assert.assertEquals(element.getText(),"₹15,989 ","Element Text Matches");
    }

    public static void placeOrder(){
        wait = new WebDriverWait(Driver,20);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertiesFetch.placeOrder)));
        Assert.assertTrue(element.isDisplayed(),"Button Not Displayed");
        element.click();
    }
}
