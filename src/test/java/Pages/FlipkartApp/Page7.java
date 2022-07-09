package Pages.FlipkartApp;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static Drivers.Driver.*;

public class Page7 {
    public static void loginVerification(){
        wait = new WebDriverWait(Driver,20);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.EditText")));
        Assert.assertTrue(element.isDisplayed(),"Login Field Not Displayed");
    }
}
