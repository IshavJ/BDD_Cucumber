package Android;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Android_1
{
    public static AppiumDriver<MobileElement> driver;



        public static void main(String args[]) throws MalformedURLException {
        DesiredCapabilities desiredCap = new DesiredCapabilities();
        desiredCap.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        desiredCap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.flipkart.android");
        desiredCap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"activity.HomeFragmentHolderActivity");

        driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCap);
    }
    }

