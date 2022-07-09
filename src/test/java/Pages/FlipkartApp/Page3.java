package Pages.FlipkartApp;

import Drivers.PropertiesFetch;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static Drivers.Driver.*;

public class Page3 {
    public static void searchInput(){
        wait = new WebDriverWait(Driver, 20);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(PropertiesFetch.Sec_bar)));
        element.sendKeys("redmi note 11");
        //Driver.findElement(By.xpath("//android.widget.TextView[@text='redmi note 11']")).click();
    }

    public static void assertInput(){
        wait = new WebDriverWait(Driver, 20);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(PropertiesFetch.Sec_bar)));
        //element.sendKeys("redmi note 11");
        Assert.assertEquals(element.getAttribute("text"),"redmi note 11","Text are not same");
        Driver.findElement(By.xpath("//android.widget.TextView[@text='redmi note 11']")).click();
    }
}
