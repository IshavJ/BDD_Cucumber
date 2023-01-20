package modules;

import Constants.Constant;
import Drivers.Actions;
import Pages.flipkartIOS.HomePage;
import Pages.flipkartIOS.SearchPage;
import org.openqa.selenium.Keys;
import org.yaml.snakeyaml.nodes.CollectionNode;

public class HomepageModule {
    public static void verifyHomepage() {
        Actions.isElementVisible(HomePage.flipkartLogo, "Flipkart logo");
        //Actions.isElementVisible(HomePage.brandMallText, "Brand mall text");
        //Actions.isElementVisible(HomePage.brandMallToggle, "Brand mall toggle");
        //Actions.elementAttributeAssertion(HomePage.brandMallToggle, "name", "Brand mall toggle", "OFF");
        Actions.isElementVisible(HomePage.searchBar, "Search bar");
        //Actions.isElementVisible(HomePage.homeTab, "Home tab");
        //Actions.isElementVisible(HomePage.categoriesTab, "Categories tab");
        Actions.isElementVisible(HomePage.accountTab, "Account tab");
        //Actions.isElementVisible(HomePage.notificationsTab, "Notifications tab");
        Actions.isElementVisible(HomePage.cartTab, "Cart tab");
    }

    public static void populatingSearchBar(String element) {
        Actions.taps(HomePage.searchBar,"Search bar");
        Actions.inputValue(SearchPage.searchField, "Search field", element);
        Constant.itemName=element;
    }
}
