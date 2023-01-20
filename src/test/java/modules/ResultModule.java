package modules;

import Constants.Constant;
import Drivers.Actions;
import Pages.flipkartIOS.ResultPage;
import Pages.flipkartIOS.SearchPage;

public class ResultModule {
    public static void verifyResultScreen(){
        Actions.isElementVisible(SearchPage.backButton,"Back button");
        Actions.textAssertion(ResultPage.resultHead, Constant.itemName,"Title inside Result screen");
        //Actions.isElementVisible(ResultPage.cartIcon,"Cart icon");
        Actions.isElementVisible(ResultPage.searchIcon,"Search icon");
        //Actions.isElementVisible(ResultPage.filterPill,"Filter pill");
        //Actions.isElementVisible(ResultPage.sortByPill,"Sort By pill");
        //Actions.isElementVisible(ResultPage.pricePill,"Price pill");
        Actions.isElementVisible(ResultPage.processorBrandPill,"Processor Brand pill");
        //Actions.isElementVisible(ResultPage.comparePill,"Compare pill");
        Actions.isElementVisible(ResultPage.fAssuredPill,"F(Assured) pill");
    }

    public static void tapsOnFirstItemInsideResultScreen(){
        Actions.taps(ResultPage.realMeC30First,"First item inside Result screen");
    }
}
