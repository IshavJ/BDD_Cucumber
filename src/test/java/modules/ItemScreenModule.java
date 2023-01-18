package modules;

import Drivers.Actions;
import Pages.flipkartIOS.SearchPage;

public class ItemScreenModule {
    public static void verifyItemScreen() {
        Actions.isElementVisible(SearchPage.backButton,"Back button");
        Actions.isElementVisible(SearchPage.backButton,"Back button");
    }
}
