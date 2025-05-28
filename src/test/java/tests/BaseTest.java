package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.DriverUtils;

import java.net.URL;

public class BaseTest {
    protected AppiumDriver driver;

    @BeforeMethod
    public void setUp() {
        DriverUtils.initializeDriver();
    }

//    @BeforeClass
//    public void setUp() throws Exception {
//
//        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), ca);
//    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        DriverUtils.quitDriver();
    }

}
