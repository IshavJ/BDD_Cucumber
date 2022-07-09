package Pages.FlipkartApp;

import Drivers.PropertiesFetch;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Drivers.Driver.*;

public class Page4 {
    public static void alert(){
        //Alert
        wait = new WebDriverWait(Driver,20);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(PropertiesFetch.locPop)));
        element.click();
    }

    public static void assertItem(){
        //Item Existence
        wait = new WebDriverWait(Driver,20);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertiesFetch.item)));
    }

    public static void itemSelection(){
        //Item Selection
        wait = new WebDriverWait(Driver,20);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertiesFetch.item)));
        element.click();
    }
}
