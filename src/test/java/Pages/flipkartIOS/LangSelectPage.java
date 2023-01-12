package Pages.flipkartIOS;

import org.openqa.selenium.By;

public class LangSelectPage {
    public static By trackPopHeading = By.xpath("//XCUIElementTypeStaticText[contains(@name,'Allow “Flipkart” to')]");
    public static By trackPopSubtext = By.xpath("//XCUIElementTypeStaticText[contains(@name,'Your data will be')]");
    public static By trackPopDeny = By.xpath("//XCUIElementTypeButton[contains(@name,'Ask App Not to Track')]");
    public static By trackPopAllow = By.xpath("//XCUIElementTypeButton[contains(@name,'Allow')]");
}
