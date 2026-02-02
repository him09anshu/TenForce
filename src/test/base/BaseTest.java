package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utils.DriverFactory;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = DriverFactory.initDriver();
    }

    @AfterTest
    public void tearDown(){
        DriverFactory.quitDriver();
    }
}
