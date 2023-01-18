package Drivers;

import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class Actions {
    public static void taps(By locator,String elementName){
        try{
            WebElement element = Driver.wait.until(ExpectedConditions.elementToBeClickable(locator));
            element.click();
            System.out.println("Tapped on "+elementName);
        }catch (Exception e){
            System.out.println("Unable to tap on "+elementName);
            Assert.assertTrue(false);
        }
    }

    public static void isElementVisible(By locator,String elementName){
        try{
            WebElement element = Driver.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            Assert.assertTrue(element.isDisplayed());
            System.out.println(elementName+" is visible");
        }catch (Exception e){
            System.out.println("Unable to find "+elementName);
            Assert.assertTrue(false);
        }
    }

    public static void elementAttributeAssertion(By locator,String attribute,String elementName,String data){
        try{
            WebElement element = Driver.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            Assert.assertEquals(element.getAttribute(attribute),data);
            System.out.println(elementName+" is visible");
        }catch (Exception e){
            System.out.println("Unable to find "+elementName);
            Assert.assertTrue(false);
        }
    }

    public static void inputValue(By locator,String elementName,String data){
        try{
            IOSElement element = (IOSElement) Driver.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element.sendKeys(data);
            System.out.println(data +" is passed into "+elementName);
        }catch (Exception e){
            System.out.println("Unable to find "+elementName);
            Assert.assertTrue(false);
        }
    }

    public static void tappingEnter(By locator){
            WebElement element = Driver.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element.sendKeys(Keys.ENTER);
    }

    public static void textAssertion(By locator,String data,String elementName){
        try{
            IOSElement element = (IOSElement) Driver.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            Assert.assertEquals(element.getText(),data);
            System.out.println(data + " is verified for "+elementName);
        }catch (Exception e){
            System.out.println("Unable to find "+elementName+" and "+data+" is mismatch");
            Assert.assertTrue(false);
        }
    }

    public static String getText(By locator,String elementName){
            IOSElement element = (IOSElement) Driver.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            System.out.println(element.getText()+" is fetched from "+elementName);
            return element.getText();
    }
}
