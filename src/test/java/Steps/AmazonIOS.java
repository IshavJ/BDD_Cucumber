package Steps;

import Constants.Constant;
import Drivers.Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonIOS {

    @Given("User launches the Amazon application")
    public void userLaunchesTheAmazonApplication(){
        Drivers.Driver.invokeIOS(Constant.AMAZON);
    }

    @Then("Verify user lands on homepage of Amazon")
    public void verifyUserLandsOnHomepageOfAmazon() {
        //name : searchTextField -- sendkeys
        //name : Select a location to see product availability
        //name : SearchBarCameraIngress
        //name : Mobiles Mobiles
        //name : Fashion Fashion
        //name : Electronics Electronics
        //name : Home Home
        //name : miniTV miniTV
        //name : Deals Deals
        //name : Fresh Fresh
        //name : Beauty Beauty
        //name : Books, Toys Books, Toys
        //name : Appliances Appliances
        //name : Essentials Essentials
    }

    @When("User taps on Account tab from bottom bar")
    public void userTapsOnAccountTabFromBottomBar() {
        //name : home
        //name : meTab -- click
        //name : cartTab
        //name : menuTab
    }

    @Then("Verify user lands on My Account screen")
    public void verifyUserLandsOnMyAccountScreen() {
        //name : Sign in for the best experience
        //name : sib -- click
        //name : cab
        //name : Check order status and track, change or return items
        //name : Shop past purchases and everyday essentials
        //name : Create lists with items you want, now or later
        //xpath : //XCUIElementTypeImage[contains(@name,'6848714.png')]
        //xpath : //XCUIElementTypeImage[contains(@name,'6848712.png')]
        //xpath : //XCUIElementTypeImage[contains(@name,'6848709.png')]
    }

    @And("Populates email field with valid email")
    public void populatesEmailFieldWithValidEmail() {
        //name : Email or phone number
        //xpath : //XCUIElementTypeStaticText[@value='Amazon.in']
        //name : Create account . New to Amazon?
        //name : Sign in . Already a customer?
        //name : Continue
        //xpath : //XCUIElementTypeStaticText[@value='cy Notice']
        //name : Conditions of Use
        //xpath : //XCUIElementTypeStaticText[@value='Privacy Notice']
        //xpath : //XCUIElementTypeStaticText[@value='Help']
        //xpath : //XCUIElementTypeStaticText[@value='Welcome']
        //name : Cancel
    }
}
