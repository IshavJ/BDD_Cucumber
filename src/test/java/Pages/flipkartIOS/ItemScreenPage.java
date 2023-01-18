package Pages.flipkartIOS;

import org.openqa.selenium.By;

public class ItemScreenPage {
    public static By searchIcon = By.xpath("(//XCUIElementTypeButton//following-sibling::XCUIElementTypeButton)[1]");
    public static By cartIcon = By.xpath("(//XCUIElementTypeButton//following-sibling::XCUIElementTypeButton)[2]");
    public static By detailsPill = By.name("Details");

}
