package Pages.FlipkartApp;

import Drivers.PropertiesFetch;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static Drivers.Driver.*;

public class Page5 {

    public static void assertButton(){
        wait = new WebDriverWait(Driver,20);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertiesFetch.Add)));
        Assert.assertTrue(element.isDisplayed(),"Button Not Displayed");
    }

    public static void addToCart(){
        wait = new WebDriverWait(Driver,20);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertiesFetch.Add)));
        element.click();
    }

    public static void applyButton(){
        try{
            wait = new WebDriverWait(Driver,20);
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertiesFetch.Apply)));
            element.click();
            addToCart();
            cartRecommendation();
        }
        catch (Throwable t){
            t.printStackTrace();
        }
    }

    public static void cartRecommendation(){
        wait = new WebDriverWait(Driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertiesFetch.GoToCart)));
        Assert.assertTrue(element.isDisplayed(),"Button not Displayed");
        element.click();
    }


    public static void verification(){
        wait = new WebDriverWait(Driver,20);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertiesFetch.Color)));
        Assert.assertNotEquals(element.getText(),"Redmi Note 11 (Horizon Blue, 128 GB)","Same");
    }
}
