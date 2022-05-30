package Assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HardAssertions_Login
{
    WebDriver driver;
    @Test
    public void Login_Demo()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement username=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("password"));

        Assert.assertTrue(username.isDisplayed());
        username.sendKeys("student");

        Assert.assertTrue(password.isDisplayed());
        password.sendKeys("Password123");

        driver.findElement(By.id("submit")).click();

        String Title= "Logged In Successfully";

       //Assert.assertEquals(Title,driver.getTitle());

       //String Logout_text=driver.findElement(By.cssSelector("#loop-container > div > article > div.post-content > div > div > div > a")).getText();
        String Logout_text="Log out";

        Assert.assertEquals(Logout_text,driver.findElement(By.cssSelector("#loop-container > div > article > div.post-content > div > div > div > a")).getText());

       //       Assert.assertTrue("Log out" ,Logout_text);

    }
}
