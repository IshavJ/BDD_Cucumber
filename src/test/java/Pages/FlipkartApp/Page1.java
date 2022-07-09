package Pages.FlipkartApp;

import Drivers.PropertiesFetch;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

import static Drivers.Driver.*;

public class Page1 {

    public static void languageSelection() throws MalformedURLException {
        wait = new WebDriverWait(Driver, 20);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertiesFetch.eng)));
        element.click();

        wait = new WebDriverWait(Driver, 20);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(PropertiesFetch.Continue)));
        element.click();
    }
}
