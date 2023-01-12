package Pages.flipkartIOS;

import Drivers.Driver;
import org.openqa.selenium.By;

public class LangSelectPage {
    public static By trackPopHeading = By.xpath("//XCUIElementTypeStaticText[contains(@name,'Allow “Flipkart” to')]");
    public static By trackPopSubtext = By.xpath("//XCUIElementTypeStaticText[contains(@name,'Your data will be')]");
    public static By trackPopDeny = By.xpath("//XCUIElementTypeButton[contains(@name,'Ask App Not to Track')]");
    public static By trackPopAllow = By.xpath("//XCUIElementTypeButton[contains(@name,'Allow')]");
    public static By notifyPopupHeading = By.xpath("//XCUIElementTypeStaticText[contains(@name,'“Flipkart” Would Like to Send You Notifications')]");
    public static By notifyPopupSubtext = By.xpath("//XCUIElementTypeStaticText[contains(@name,'Notifications may include alerts,");
    public static By notifyPopupDeny = By.name("Don’t Allow");
    public static By notifyPopupAllow = By.name("Allow");
    public static By languageHeading = By.name("Choose your language");
    public static By languageTitle = By.name("Choose Language");
    public static By languagesText = By.className("XCUIElementTypeStaticText");
    public static By englishLanguage = By.name("English");
    public static By continueButton = By.name("Continue");
}
