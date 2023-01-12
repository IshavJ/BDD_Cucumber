package modules;

import Drivers.Driver;
import Pages.flipkartIOS.LangSelectPage;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class LangSelectorModule {
    public static void verifyTrackingPopupIsVisible(){
        Driver.Driver.findElement(LangSelectPage.trackPopHeading).isDisplayed();
        Driver.Driver.findElement(LangSelectPage.trackPopSubtext).isDisplayed();
        Driver.Driver.findElement(LangSelectPage.trackPopDeny).isDisplayed();
        Driver.Driver.findElement(LangSelectPage.trackPopAllow).isDisplayed();
    }

    public static void tapsOnNotToTrackOption(){
        Driver.Driver.findElement(LangSelectPage.trackPopDeny).click();
    }

    public static void verifyNotificationPopup() {
        Driver.Driver.findElement(LangSelectPage.notifyPopupHeading).isDisplayed();
        Driver.Driver.findElement(LangSelectPage.notifyPopupSubtext).isDisplayed();
        Driver.Driver.findElement(LangSelectPage.notifyPopupAllow).isDisplayed();
        Driver.Driver.findElement(LangSelectPage.notifyPopupDeny).isDisplayed();
    }

    public static void tapsOnAllowNotifications(){
        Driver.Driver.findElement(LangSelectPage.notifyPopupAllow).click();
    }

    public static void verifyLanguageScreen(){
        Driver.wait.until(ExpectedConditions.presenceOfElementLocated(LangSelectPage.languageHeading));
        Driver.Driver.findElement(LangSelectPage.languageHeading).isDisplayed();
        Driver.wait.until(ExpectedConditions.presenceOfElementLocated(LangSelectPage.languageTitle));
        Driver.Driver.findElement(LangSelectPage.languageTitle).isDisplayed();
        String[] languagesText = {"Hindi","Telgu","Tamil","English"};
        Driver.wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(LangSelectPage.languagesText));
        List<MobileElement> languages = Driver.Driver.findElements(LangSelectPage.languagesText);
        for (MobileElement element : languages){
            if(element.getText().equals("English")){
                System.out.println("English language is visible inside language Screen");
            }
        }
        try{
            Driver.wait.until(ExpectedConditions.presenceOfElementLocated(LangSelectPage.continueButton));
            Driver.Driver.findElement(LangSelectPage.continueButton).isEnabled();
        }catch (Exception e){
            System.out.println("Continue Button is disabled");
        }
    }

    public static void tapsOnEnglishLanguage(){
        Driver.wait.until(ExpectedConditions.presenceOfElementLocated(LangSelectPage.englishLanguage));
        Driver.Driver.findElement(LangSelectPage.englishLanguage).click();
    }

    public static void verifyContinueButtonIsEnabled(){
        Driver.wait.until(ExpectedConditions.presenceOfElementLocated(LangSelectPage.continueButton));
        Driver.Driver.findElement(LangSelectPage.continueButton).isEnabled();
    }

    public static void tapsOnContinueButton(){
        Driver.Driver.findElement(LangSelectPage.continueButton).click();
    }
}
