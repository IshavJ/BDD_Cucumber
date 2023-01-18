package Steps;

import Constants.Constant;
import Pages.flipkartIOS.LangSelectPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.*;

public class FlipkartIOSSteps {
    @Given("User launches the application")
    public void user_launches_the_application(){
        Drivers.Driver.invokeIOS(Constant.FLIPKART);
    }


//    @And("Selects English as native language")
//    public void selectsEnglishAsNativeLanguage() {
//        //LangSelectorModule.verifyTrackingPopupIsVisible();
//        //LangSelectorModule.tapsOnNotToTrackOption();
//        //LangSelectorModule.verifyNotificationPopup();
//        //LangSelectorModule.tapsOnAllowNotifications();
//        LangSelectorModule.verifyLanguageScreen();
//        LangSelectorModule.tapsOnEnglishLanguage();
//        LangSelectorModule.verifyContinueButtonIsEnabled();
//        LangSelectorModule.tapsOnContinueButton();
//    }

    @Then("Verify user lands on homepage")
    public void verifyUserLandsOnHomepage() {
        HomepageModule.verifyHomepage();
    }

    @When("User enters the {string} into search bar")
    public void userEntersTheItemIntoSearchBar(String element) {
        HomepageModule.populatingSearchBar(element);
    }

    @Then("Verify user lands into Search screen")
    public void verifyUserLandsIntoSearchScreen() {
        SearchModule.verifySearchScreen();
    }

    @When("User selects the desired item from the suggestion")
    public void userSelectsTheDesiredItemFromTheSuggestion() {
        SearchModule.tapsOnDesiredItem();
    }

    @Then("Verify user lands on Result screen")
    public void verifyUserLandsOnResultScreen() {
        ResultModule.verifyResultScreen();
    }

    @When("User selects first item from Result screen")
    public void userSelectsFirstItemFromResultScreen() {
        ResultModule.tapsOnFirstItemInsideResultScreen();
    }

    @Then("Verify user lands item screen")
    public void verifyUserLandsItemScreen() {
        ItemScreenModule.verifyItemScreen();
    }
}
