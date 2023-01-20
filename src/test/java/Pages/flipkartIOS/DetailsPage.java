package Pages.flipkartIOS;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class DetailsPage {
    public static By productDetailsHeading = By.xpath("//XCUIElementTypeStaticText[@name='Product Details']");
    public static By backButton = By.xpath("/(//XCUIElementTypeStaticText[@name='Product Details']/parent::" +
            "XCUIElementTypeOther[@name='Product Details']/parent::XCUIElementTypeOther/XCUIElementTypeOther)[1]");
    public static String itemName = "//XCUIElementTypeStaticText[@name='%s']"; //realme C30 (Lake Blue, 32 GB)
    public static By descriptionTab = By.name("DESCRIPTION");
    public static By specificationTab = By.name("SPECIFICATIONS");
    public static By moreInfoTab = By.name("MORE INFO");
    public static By processorText = MobileBy.AccessibilityId("Incredible Unisoc T612 Processor");
}
