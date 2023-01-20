package modules;

import Constants.Constant;
import Drivers.Actions;
import Drivers.Driver;
import Pages.flipkartIOS.DetailsPage;
import Pages.flipkartIOS.ItemScreenPage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import javax.swing.*;
import java.time.Duration;

public class DetailsModule {

    public static void tapsOnDetailsButton(){
        Actions.taps(ItemScreenPage.detailsPill,"Details pill");
    }

    public static void verifyDetailsScreen(){
        Actions.textAssertion(DetailsPage.productDetailsHeading,"Product Details","Details screen title");
        Actions.isElementVisible(DetailsPage.backButton,"Back button");
        Actions.isElementVisible(By.xpath(String.format(DetailsPage.itemName,Constant.itemName)),Constant.itemName);
        Actions.isElementVisible(DetailsPage.moreInfoTab,"More info tab");
        Actions.isElementVisible(DetailsPage.specificationTab,"Specifications tab");
        Actions.isElementVisible(DetailsPage.descriptionTab,"Description tab");
        Actions.textAssertion(DetailsPage.processorText,"Incredible Unisoc T612 Processor","Processor description");
        String[] DetailsHeading = new String[]{"Incredible Unisoc T612 Processor","Robust Battery","New Suitcase Design","Terrific 8 MP AI Camera","3 Card Slot Advantage","Ultra Saving Mode Reliability","Splendid 5 MP Selfie Camera"};
        for (String detailsText:DetailsHeading){
            try{
                Actions.isElementVisible(By.xpath(String.format(DetailsPage.itemName,detailsText)),detailsText);
            }catch (Exception e){
                TouchAction action =new TouchAction(Driver.Driver);
                Dimension size	=Driver.Driver.manage().window().getSize();
                int width=size.width;
                int height=size.height;
                int middleOfX=width/2;
                int startYCoordinate= (int)(height*.7);
                int endYCoordinate= (int)(height*.2);

                action.press(PointOption.point(middleOfX, startYCoordinate))
                        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                        .moveTo(PointOption.point(middleOfX, endYCoordinate)).release().perform();
                Actions.isElementVisible(By.xpath(String.format(DetailsPage.itemName,detailsText)),detailsText);
            }
        }
    }
}
