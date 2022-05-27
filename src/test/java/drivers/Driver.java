package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class Driver {
    public static WebDriver driver;

    public static void web_Setup() throws IOException {
        PropertiesFetch.prop();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(PropertiesFetch.url);
    }

    public static void terminate(){
        driver.quit();
    }

    public static void close(){
        driver.close();
    }
}
