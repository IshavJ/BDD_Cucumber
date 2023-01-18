package iosTraining;

import Constants.Constant;
import Drivers.Actions;
import Drivers.Driver;
import org.openqa.selenium.By;

public class TimerApp {
    public static void main(String[] args) {
        Driver.invokeIOS(Constant.TIMER);
        Actions.isElementVisible(By.xpath("//XCUIElementTypeStaticText[@name='World Clock']"),"World Clock title");
        Actions.isElementVisible(By.xpath("//XCUIElementTypeButton[@name='World Clock']"),"World Clock tab");
        Actions.isElementVisible(By.xpath("//XCUIElementTypeButton[@name='Alarm']"),"World Clock tab");
        Actions.isElementVisible(By.xpath("//XCUIElementTypeButton[@name='Stopwatch']"),"Stopwatch tab");
        Actions.isElementVisible(By.xpath("//XCUIElementTypeButton[@name='Timer']"),"Timer tab");
        Actions.taps(By.name("Edit"),"Edit text link");
        Actions.isElementVisible(By.xpath("(//XCUIElementTypeCell/XCUIElementTypeButton)[1]"),"- button");
        Actions.isElementVisible(By.xpath("(//XCUIElementTypeCell/XCUIElementTypeButton)[2]"),"Reorder button");
        Actions.taps(By.name("Done"),"Done text link");
        Actions.taps(By.name("Add"),"+ button");
        Actions.isElementVisible(By.name("Choose a City"),"Choose a City title");
        Actions.isElementVisible(By.name("Cancel"),"Cancel text button");
        Actions.isElementVisible(By.name("Search"),"Search bar");
        Actions.isElementVisible(By.name("Search"),"Search bar");
    }
}
