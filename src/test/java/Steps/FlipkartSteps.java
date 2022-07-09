package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

import static Pages.FlipkartApp.Page1.languageSelection;
import static Pages.FlipkartApp.Page2.searchBarClick;
import static Pages.FlipkartApp.Page3.assertInput;
import static Pages.FlipkartApp.Page3.searchInput;
import static Pages.FlipkartApp.Page4.*;
import static Pages.FlipkartApp.Page5.*;
import static Pages.FlipkartApp.Page6.*;
import static Pages.FlipkartApp.Page7.loginVerification;

public class FlipkartSteps {

    @Given("user enters the flipkart app")
    public void user_enters_the_flipkart_app() throws MalformedURLException {
        languageSelection();
    }

    @When("enter item")
    public void enter_item() {
        searchBarClick();
        searchInput();
    }

    @When("verify text in search bar")
    public void assert_text_in_bar(){
        assertInput();
    }

    @When("verify if item exist")
    public void item_check(){
        alert();
        assertItem();
    }

    @When("select desired item")
    public void select_desired_item() {
        itemSelection();
    }

    @When("verify if add to cart button is displayed")
    public void assert_add_to_cart(){
        assertButton();
    }

    @When("click on add to cart button")
    public void click_on_add_to_cart_button() {
        verification();
        addToCart();
        cartRecommendation();
    }

    @When("verify if apply button exist")
    public void assert_apply_button() {
        //applyButton();
        System.out.println("Enable if apply button exist");
    }

    @When("click on place order")
    public void click_on_place_order() {
//        verifyTotal();
        placeOrder();
    }

    @Then("verify if login field is displayed")
    public void verify_if_login_field_is_displayed() {
        loginVerification();
    }
}
