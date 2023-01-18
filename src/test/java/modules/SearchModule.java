package modules;

import Drivers.Actions;
import Pages.flipkartIOS.SearchPage;

public class SearchModule {
    public static void verifySearchScreen() {
        Actions.isElementVisible(SearchPage.searchField, "Search field");
        Actions.isElementVisible(SearchPage.crossIcon, "Cross icon");
        Actions.isElementVisible(SearchPage.backButton, "Back button");
    }

    public static void tapsOnDesiredItem() {
        Actions.tappingEnter(SearchPage.searchField);
    }
}
