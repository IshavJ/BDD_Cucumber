package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DummyHTml {
    WebDriver driver;
    SoftAssert softAssert=new SoftAssert();
    @Given("User on the html page")
    public void user_on_the_html_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
            driver.get("file:///C:/Users/HP/Downloads/Dummy%20(1).html?firstName=v&lastName=sc&gender=on");
    }

    @When("User click on Click Me one ,Click Me Two and Click Me Three")
    public void user_click_on_click_me_one_click_me_two_and_click_me_three() {
        String one, two, three;
//      one=driver.findElement(By.className("button1")).getText();
//      two=driver.findElement(By.className("button2")).getText();
//      three=  driver.findElement(By.className("button")).getText();
//        System.out.println(one+" "+two+" "+three);
//
        one = driver.findElement(By.xpath("//button[@id='myButton'][text()='Click Me One']")).getText();
        two = driver.findElement(By.xpath("//button[@id='myButton'][text()='Click Me Two']")).getText();
        three = driver.findElement(By.xpath("//button[@class='button'][text()='Click Me Three']")).getText();
        System.out.println(one + " " + two + " " + three);

        WebElement obj=driver.findElement(By.xpath("//button[@id='myButton'][text()='Click Me One']"));
        Assert.assertTrue(obj.isDisplayed());



        WebElement obj1=driver.findElement(By.xpath("//button[@id='myButton'][text()='Click Me Two']"));

        softAssert.assertNotEquals(obj1,obj);
    }

    @When("verify heading")
    public void verify_heading() {
        //driver.getTitle().equals("This is a dummy caption");
        //    driver.findElement(By.name("This is a dummy caption"));
        Assert.assertEquals(driver.findElement(By.tagName("caption")).getText(),"This is a dummy caption");

    }

    @When("Fetch data of table")
    public void fetch_data_of_table() {
        for (int i = 2; i <= 8; i++) {
            System.out.print(driver.findElement(By.cssSelector("body > table > tbody > tr:nth-child(" + i + ") > td:nth-child(1)" + " ")).getText() + " ");
            System.out.print(driver.findElement(By.cssSelector("body > table > tbody > tr:nth-child(" + i + ") > td:nth-child(2)" + " ")).getText() + " ");
            System.out.println(driver.findElement(By.cssSelector("body > table > tbody > tr:nth-child(" + i + ") > td:nth-child(3)")).getText());
        }

    }

    @When("enter first name and last name")
    public void enter_first_name_and_last_name() {


       /*driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Harsh");
        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Awasthi");
        */
        driver.findElement(By.cssSelector("form>input#firstName")).sendKeys("Harsh");
        driver.findElement(By.xpath("//*[@type='text']//following::input[@name='lastName']")).sendKeys("Awasthi");
       // driver.findElement(By.cssSelector("form>#lastName")).sendKeys("Awasthi");
    }

    @When("Select gender")
    public void select_gender() {
        driver.findElement(By.xpath("//input[@name='gender']/following-sibling::input")).click();//for female
        driver.findElement(By.xpath("//input[@type='radio'][@id='Male']")).click();
    }

    @Then("Click on Submit")
    public void click_on_submit() {
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.findElement(By.id("submit")).click();
    }

    @When("Click on link")
    public void click_on_link()
    {
        WebElement Text=  driver.findElement(By.linkText("Link To Download Git Executable File"));
        Assert.assertEquals(Text.getText(),"Link To Download Git Executable File");

        Text.click();

        String parent = driver.getWindowHandle();//returns string
        Set<String> win_handle = driver.getWindowHandles();
        System.out.println(win_handle);

        Iterator<String> i = win_handle.iterator();

        while (i.hasNext()) {
            if (parent != i.next()) {
                driver.switchTo().window(i.next());
                System.out.println(driver.getTitle());


                driver.findElement(By.linkText("macOS")).click();
                driver.switchTo().window(parent);


            }
        }

    }
}