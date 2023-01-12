package Drivers;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Driver {
    public static WebDriver driver;
    public static WebDriverWait wait,w;
    public static WebElement pop,element,ele;
    public static AppiumDriver<MobileElement> Driver;
    public static DesiredCapabilities desiredCap;
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest test;

    public static void web_Setup() throws IOException {
        PropertiesFetch.prop();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(PropertiesFetch.url);
    }

    public static void desiredCap() throws MalformedURLException {
        desiredCap = new DesiredCapabilities();
        desiredCap.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        desiredCap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.flipkart.android");
        desiredCap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.flipkart.android.activity.HomeFragmentHolderActivity");

        Driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCap);
    }

    public static void invokeIOS(){
        try{
            desiredCap = new DesiredCapabilities();
            desiredCap.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 7 Plus");
            desiredCap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ios");
            desiredCap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
            desiredCap.setCapability(IOSMobileCapabilityType.BUNDLE_ID,"com.appflipkart.flipkart");
            desiredCap.setCapability(IOSMobileCapabilityType.XCODE_ORG_ID,"D6JRRZ52MB");
            desiredCap.setCapability(IOSMobileCapabilityType.WDA_CONNECTION_TIMEOUT,"600000");
            desiredCap.setCapability(IOSMobileCapabilityType.XCODE_SIGNING_ID,"iPhone Developer");
            desiredCap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"15.7.2");
            desiredCap.setCapability(MobileCapabilityType.UDID,"26dd89d1c8618c0f5df95cf1ef36d1214b77ffc4");
            desiredCap.setCapability(MobileCapabilityType.NO_RESET,"True");

            Driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCap);
            wait = new WebDriverWait(Driver,20);
            //Relaunch
            Driver.launchApp();
        }catch (Exception e){
            System.out.println("Connection not established :( ....");
        }
    }

    public static void terminate(){
        driver.quit();
    }

    public static void close(){
        driver.close();
    }

    public static void closeApp(){
        Driver.closeApp();
    }

    public static void extent(){
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/Extent-op/ExtentReports.html");

        //Settings
        htmlReporter.config().setDocumentTitle("Flipkart Report");  //title
        htmlReporter.config().setReportName("Add to Cart Functionality"); //name
        htmlReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        extent.setSystemInfo("Browser","Chrome");
        extent.setSystemInfo("OS","Windows");
    }

    public static void endExtent(){
        extent.flush();
    }
}
