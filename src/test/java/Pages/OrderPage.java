package Pages;

import drivers.PropertiesFetch;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.io.IOException;
import static drivers.Driver.driver;

public class OrderPage {
    public static void titleItem() {
        Assert.assertNotEquals(driver.getTitle(), " ", "Unexpected Equal");
    }

    public static void addToCart() throws IOException {
        PropertiesFetch.prop();
        driver.findElement(By.cssSelector(PropertiesFetch.addtoCart)).click();
    }

}
