package Drivers;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static Drivers.Driver.*;

public class Hooks {
    //For app...
    @Before("@App")
    public void setup() throws IOException {
        System.out.println("Before Hook Called");
        PropertiesFetch.prop();
        desiredCap();
    }

    @After("@App")
    public void end() {
        System.out.println("After Hook Called");
        closeApp();
    }

    @AfterStep
    public void addScreenshot(Scenario scenario){

//        final byte[] screenshot = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.BYTES);
//        scenario.attach(screenshot, "image/png", "image");

        //validate if scenario has failed
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
       }
    }

    //For web....
    @Before("@Web")
    public void Setup() throws IOException {
        System.out.println("Before Hook Called");
        web_Setup();
//        extent();
    }

//    @AfterStep("@Web")
//    public static String getScreenshot(WebDriver wbdriver, String scshotName) throws IOException {
//        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//        TakesScreenshot ts = (TakesScreenshot) wbdriver;
//        File src = ts.getScreenshotAs(OutputType.FILE);
//
//        String dstnt = System.getProperty("user.dir")+"/screenShot/"+scshotName+dateName+".png";
//        File finalDestination = new File(dstnt);
//        FileUtils.copyFile(src,finalDestination);
//
//        return dstnt;
//    }
//    public static void tearDown(ITestResult result) throws IOException {
//        if(result.getStatus()== ITestResult.FAILURE){
//            test.log(Status.FAIL,"Test Case Failed is : " + result.getName()); //add name
//            test.log(Status.FAIL,"Test Case Failed is : " + result.getThrowable()); //add error
//
//            String scShotPath = Hooks.getScreenshot(driver,result.getName());
//            test.addScreenCaptureFromPath(scShotPath);
//        }
//        else if(result.getStatus()==ITestResult.SKIP){
//            test.log(Status.SKIP,"Test Case Skipped is : "+result.getName());
//        }
//        else if(result.getStatus()==ITestResult.SUCCESS){
//            test.log(Status.PASS,"Test Case Passed is : "+result.getName());
//        }
//    }

    @After("@Web")
    public void End() {
//        endExtent();
        System.out.println("After Hook Called");
        close();
    }
}
