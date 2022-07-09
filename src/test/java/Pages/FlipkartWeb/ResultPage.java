package Pages.FlipkartWeb;

import Drivers.PropertiesFetch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.io.IOException;
import static Drivers.Driver.driver;

public class ResultPage {
    public static void itemDescription() throws IOException {
        PropertiesFetch.prop();
        WebDriverWait w = new WebDriverWait(driver,10);
        WebElement ele = w.until(ExpectedConditions.presenceOfElementLocated(By.xpath(PropertiesFetch.itemDesc)));
        Assert.assertNotEquals(ele.getText(), "", "Not Equal");
        ele.click();
    }

    public static String checkHead(String s){
        WebDriverWait w = new WebDriverWait(driver,10);
        WebElement i = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s)));
        return i.getText();
    }
}
