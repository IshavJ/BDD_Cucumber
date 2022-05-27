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

public class ResultPage {
    public static void ItemDescription() throws IOException {
        PropertiesFetch.prop();
        WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(5000));
        WebElement ele = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath(PropertiesFetch.itemDesc)));
        Assert.assertNotEquals(ele.getText(), "", "Not Equal");
        ele.click();
    }

    public static String CheckHead(String s){
        WebDriverWait w = new WebDriverWait(driver,Duration.ofMillis(4000));
        WebElement i = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s)));
        return i.getText();
    }
}
