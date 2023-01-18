package Pages.flipkartIOS;

import org.openqa.selenium.By;

public class SearchPage {
    public static By searchField = By.className("XCUIElementTypeTextField");
    public static By crossIcon = By.xpath("//XCUIElementTypeTextField//following-sibling::XCUIElementTypeOther");
    public static By backButton = By.name("Back");
    public static By searchSuggestion = By.xpath("(//XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeStaticText)[1]");
}
