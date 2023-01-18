package Pages.flipkartIOS;

import org.openqa.selenium.By;

public class ResultPage {
    public static By searchIcon = By.xpath("(//XCUIElementTypeButton[@name='Back']/following-sibling::XCUIElementTypeButton)[2]");
    public static By cartIcon = By.xpath("(//XCUIElementTypeButton[@name='Back']/following-sibling::XCUIElementTypeButton)[3]");
    public static By resultHead = By.xpath("(//XCUIElementTypeButton[@name='Back']/following-sibling::XCUIElementTypeButton)[1]");
    public static By filterPill = By.xpath("//XCUIElementTypeOther[@name='Filter' and @accessible='true']");
    public static By comparePill = By.xpath("//XCUIElementTypeOther[@name='Compare' and @accessible='true']");
    public static By pricePill = By.xpath("//XCUIElementTypeOther[@name='Price' and @accessible='true']");
    public static By processorBrandPill = By.xpath("//XCUIElementTypeOther[@name='Processor Brand' and @accessible='true']");
    public static By sortByPill = By.xpath("//XCUIElementTypeOther[@name='Sort By' and @accessible='true']");
    public static By fAssuredPill = By.xpath("//XCUIElementTypeOther[@name='Plus\n" +
            "(FAssured) ' and @accessible='true']");
    public static By realMeC30First = By.xpath("//XCUIElementTypeOther[contains(@name,'realme C30 " +
            "(Lake Blue, 32 GB) 2 GB RAM') and @accessible='true']");

}
