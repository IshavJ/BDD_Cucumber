package Pages.FlipkartApp;

import Drivers.PropertiesFetch;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Drivers.Driver.*;

public class Page2 {
    //Page-2
    //searchBar
    public static void searchBarClick(){
        wait = new WebDriverWait(Driver,30);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropertiesFetch.SearchBar)));
        element.click();
    }
}
