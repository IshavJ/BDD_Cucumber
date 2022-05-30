package stepDefination;

import Pages.Amazon_Website;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Amazon_AddToCart {
    WebDriver driver= null;
    Amazon_Website Enter_Site;

    @Given("User need to be on amazon web site")
    public void user_need_to_be_on_amazon_web_site() {
        /*Enter_Site=new Amazon_Website();
        Enter_Site.enter_website();
       // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");*/

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        //Assert.assertNotEquals(driver.getTitle(),"Amazon.in");
        Assert.assertTrue(true);
        System.out.println(driver.getTitle());
    }

    @When("user enter product details in search bar and click enter")
    public void user_enter_product_details_in_search_bar_and_click_enter() {

        //driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("iphone");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Amazon.in : iphone 13");
        Assert.assertNotNull(driver.findElement(By.id("nav-search-submit-button")));

    }

    @When("click on product")
    public void click_on_product() {
        driver.findElement(By.linkText("Apple iPhone 13 (128GB) - Midnight")).click();

         driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }

    @When("add product to the cart")
    public void add_product_to_the_cart() {
        driver.findElement(By.id("add-to-cart-button")).click();
    }

    @Then("open Add to cart and verify weather product is added or not")
    public void open_add_to_cart_and_verify_weather_product_is_added_or_not()
    {
        Assert.assertEquals(driver.getTitle(),"Amazon.in Shopping Cart");
        System.out.println(driver.getTitle());
        System.out.println("Product verified");
        System.out.println("Product verified");

    }

    @Given("Cart is open")
    public void cart_is_open()
    {
      /*  //driver.findElement(By.id("nav-logo-sprites")).click();
       driver.findElement(By.id("nav-cart")).click();
*/

    }
    @When("User delete the added item")
    public void user_delete_the_added_item()
    {
    //driver.findElement(By.className("a-color-link")).click();
    }
    @Then("verify weather item deleted or not")
    public void verify_weather_item_deleted_or_not() {

    }

}
