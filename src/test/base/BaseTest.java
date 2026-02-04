package base;

import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import utils.ExtentManager;

import java.lang.reflect.Method;

public class BaseTest {

    protected static WebDriver driver;
    protected static ExtentTest test;
    protected ExtentReports extent;

    @BeforeSuite
    public void setupReport() {
        extent = ExtentManager.getExtentReport();
    }

    @BeforeMethod
    public void setUp(Method method) {
        driver = DriverFactory.initDriver();
        test = extent.createTest(method.getName());
    }

    @AfterMethod
    public void tearDown(ITestResult result){

        if (result.getStatus() == ITestResult.SUCCESS) {
            test.pass("Test Passed successfully");

        } else if (result.getStatus() == ITestResult.FAILURE) {

            test.fail("Test Failed");
            test.fail(result.getThrowable());

        } else if (result.getStatus() == ITestResult.SKIP) {
            test.skip("Test Skipped");
        }

        DriverFactory.quitDriver();
    }

    @AfterSuite
    public void flushReport(){
        extent.flush();
    }
}
