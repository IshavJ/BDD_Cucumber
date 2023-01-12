package Steps;

import Pages.flipkartIOS.LangSelectPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import modules.LangSelectorModule;

public class FlipkartIOSSteps {
    @Given("User launches the application")
    public void user_launches_the_application(){
        Drivers.Driver.invokeIOS();
    }


    @And("Selects English as native language")
    public void selectsEnglishAsNativeLanguage() {
        //LangSelectorModule.verifyTrackingPopupIsVisible();
        //LangSelectorModule.tapsOnNotToTrackOption();
        //LangSelectorModule.verifyNotificationPopup();
        //LangSelectorModule.tapsOnAllowNotifications();
        LangSelectorModule.verifyLanguageScreen();
        LangSelectorModule.tapsOnEnglishLanguage();
        LangSelectorModule.verifyContinueButtonIsEnabled();
        LangSelectorModule.tapsOnContinueButton();
    }
}
