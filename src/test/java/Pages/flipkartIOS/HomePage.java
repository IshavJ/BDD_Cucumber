package Pages.flipkartIOS;

import org.openqa.selenium.By;

public class HomePage {
    public static By flipkartLogo = By.xpath("//XCUIElementTypeOther[@name='Brand Mall OFF Search for products']//XCUIElementTypeOther//XCUIElementTypeOther" +
            "//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeOther//XCUIElementTypeOther");
    public static By searchBar = By.xpath("//XCUIElementTypeOther[@name='Search for products' and @accessible='true']");
    public static By brandMallText = By.name("Brand Mall");
    public static By brandMallToggle = By.xpath("//XCUIElementTypeOther[@name='OFF' and @accessible='true']");
    public static By tabBar = By.name("Tab Bar");
    public static By categoriesTab = By.name("Categories");
    public static By homeTab = By.name("Home");
    public static By notificationsTab = By.name("Notifications");
    public static By accountTab = By.name("Account");
    public static By cartTab = By.name("Cart");
}
