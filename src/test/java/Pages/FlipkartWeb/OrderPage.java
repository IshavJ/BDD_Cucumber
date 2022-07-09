package Pages.FlipkartWeb;

import Drivers.PropertiesFetch;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.io.IOException;
import static Drivers.Driver.driver;

public class OrderPage {
    public static void titleItem() {
        Assert.assertNotEquals(driver.getTitle(), " ", "Unexpected Equal");
    }

    public static void addToCart() throws IOException {
        PropertiesFetch.prop();
        driver.findElement(By.cssSelector(PropertiesFetch.addtoCart)).click();
    }

}
