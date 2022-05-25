package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Enter
{
    WebDriver driver;
    By EBook =By.xpath("//(a[@title='FREE eBooks'])[2]");

 /*   public Page_Enter(WebDriver driver)
    {
        this.driver=driver;
    }*/

    public void enter_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.softwaretestinghelp.com/");
    }
    public void click_Ebook()
    {
        driver.findElement(EBook).click();
    }
}
