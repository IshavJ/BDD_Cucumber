package Steps;

import Pages.*;
import drivers.Driver;
import drivers.PropertiesFetch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import static drivers.Driver.driver;

public class FlipkartStep {

    @Given("user browse to the site")
    public void user_browse_to_the_site() throws IOException {
        //browser
        Driver.web_Setup();
    }

    @When("user enter text inside search bar")
    public void user_enter_inside_serach_bar() throws IOException {
        //dealing with alert
        HomePage.popupClear();

        //Text to the search bar
        HomePage.SearchBarTxt(PropertiesFetch.sendingKeys);
    }

    @When("click on search button")
    public void click_on_search_button() throws IOException {
        HomePage.SearchButtonClick();
    }

    @When("click on item")
    public void click_on_item() throws IOException {
        ResultPage.ItemDescription();
    }

    @Then("click on add to cart and perform verifications")
    public void click_on_add_to_cart() throws IOException {
        //Window Handle
        String parent = driver.getWindowHandle();
        Set<String> win = driver.getWindowHandles();
        Iterator<String> i = win.iterator();

        //looping via iterator
        while (i.hasNext()) {
            if (parent != i.next()) {
                driver.switchTo().window(i.next());

                //Assertion for heading
                OrderPage.titleItem();

                //Add to cart button
                OrderPage.addToCart();

                //total check
                PlaceOrderPage.totalAmount();

                //Order placing
                PlaceOrderPage.placeOrder();

                //Visibility of continueButton
                AuthenticationPage.continueButton();

                Driver.close();
                driver.switchTo().window(parent);
                Driver.close();
            }
        }
    }
}