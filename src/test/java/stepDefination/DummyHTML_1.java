package stepDefination;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyHTML_1
{
    WebDriver driver;
    @Test
    public void Open_Html_Page()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("file:///C:/Users/HP/Downloads/Dummy%20(1).html");
    }
    @Test
    public void Click_me_Buttons()
    {




    }
}
