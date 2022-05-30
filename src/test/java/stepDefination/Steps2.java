package stepDefination;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class Steps2 {

    ChromeDriver driver;
    @Given("open chrome")
    public void open_chrome() {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("https://www.google.co.in/");
    }
    @Given("search for dominos and click enter")
    public void search_for_dominos_and_click_enter() {
       driver.findElement(By.name("q")).sendKeys("Dominos");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

    }
    @When("Click on dominos ilnk")
    public void click_on_dominos_ilnk() {
       driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3")).click();
    }
    @Then("verify that user is on page or not")
    public void verify_that_user_is_on_page_or_not() {
        driver.findElement(By.xpath("//*[@id=\"top-header\"]/a[1]/img"));
    }
    @Then("close browser")
    public void close_browser() {
        driver.close();
           }

}
