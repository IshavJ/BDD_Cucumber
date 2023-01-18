package Pages.flipkartIOS;

import org.openqa.selenium.By;

public class DetailsPage {
    public static By productDetailsHeading = By.xpath("//XCUIElementTypeStaticText[@name='Product Details']");
    public static By backButton = By.xpath("/(//XCUIElementTypeStaticText[@name='Product Details']/parent::" +
            "XCUIElementTypeOther[@name='Product Details']/parent::XCUIElementTypeOther/XCUIElementTypeOther)[1]");
    public static By itemName = By.xpath("//XCUIElementTypeStaticText[@name='%s']"); //realme C30 (Lake Blue, 32 GB)
    public static By descriptionTab = By.name("DESCRIPTION");
    public static By specificationTab = By.name("SPECIFICATIONS");
    public static By moreInfoTab = By.name("MORE INFO");
}
