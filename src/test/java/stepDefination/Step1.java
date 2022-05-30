/*
package stepDefination;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Step1 {
WebDriver driver;

    @Given("user on iink")
    public void user_on_iink() {
        WebDriverManager.chromedriver().setup();



        driver = new ChromeDriver();
//        driver.get("https://www.softwaretestinghelp.com/");
        driver.get("https://www.softwaretestinghelp.com/practical-software-testing-new-free-ebook-download/");

    }
    @When("user navigate free e book and click on it")
    public void user_navigate_free_e_book_and_click_on_it() {
      driver.findElement(By.xpath("(//a[@title='FREE eBooks'])[2]")).click();
           }
    @Then("verify that user should be ebook page and close website")
    public void verify_that_user_should_be_ebook_page_and_close_website() {
       driver.getTitle().equals("Practical Software Testing – New FREE EBook [Download]");
        driver.close();
    }

    @Then("user click on water fall model")
    public void user_click_on_water_fall_model() {
        driver.findElement(By.xpath("//a[@title='Waterfall model']")).click();
    }

    @Then("verify that he is on the another web page")
    public void verify_that_he_is_on_the_another_web_page() {
      driver.getTitle().equals("What Is SDLC Waterfall Model?");
      driver.close();
    }
}
*/
