package tests;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CareersPage;
import pages.HomePage;
import pages.JobOpeningPage;
import utils.WaitUtil;

import javax.swing.*;
import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void verifyTenforceScenario(){

        HomePage homePage = new HomePage(driver);
        CareersPage careerPage = new CareersPage(driver);
        JobOpeningPage jobOpeningPage = new JobOpeningPage(driver);

        driver.get("https://www.tenforce.com/");

        homePage.clickOnCookieAgreeButton();

        homePage.validatecareersLink();
        homePage.clickOnCareers();

        String text = careerPage.validateLifeAtTenforceText().getText();
        Assert.assertEquals(text, "LIFE AT TENFORCE");


        careerPage.clickOnLifeAtTenforceText();


        careerPage.clickOnlifeOfTwoInternsText();

        Actions actions = new Actions(driver);
        for(int i=0; i<2; i++) {
            actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        }

        driver.navigate().back();


        careerPage.clickOnjobOpeningsText();


        String actualText = jobOpeningPage.validateFeelFreeText().getText();
        Assert.assertEquals(actualText, "Feel free to send your CV to");


    }
}
