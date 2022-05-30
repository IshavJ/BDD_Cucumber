package Locator_Startegies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");

      //  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Sucessful");
        //driver.findElement(By.xpath("//header[@id='navbar-main']//child::input[@id='twotabsearchtextbox']")).sendKeys("Sucessful");

     //   driver.findElement(By.xpath("//div[@id='nav-cart-count-container']//ancestor::a")).click();//ancestor
        //div[@id='nav-cart-count-container']//descendant::span //descendant cart

         //driver.findElement(By.xpath("//div[@id='nav-xshop']//descendant::a[text()='Best Sellers']")).click();
         //driver.findElement(By.xpath("//a[@class='nav-a  ']//following-sibling::a[text()='Mobiles']")).click();
        // driver.findElement(By.xpath("//a[@class='nav-a  ']//preceding::a[text()='Customer Service']")).click();
         //driver.findElement(By.xpath("//a[@class='nav-a  ']/following::a[text()='Customer Service']")).click();
         driver.findElement(By.xpath("//a[@class='nav-a  ']//following::a[text()='Mobiles']")).click();
         //a[@class='nav-a  ']//following::a[text()='Amazon Pay']



    }



}

