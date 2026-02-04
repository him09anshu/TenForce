package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CareersPage;
import pages.HomePage;
import pages.JobOpeningPage;
import utils.CommonUtils;

public class LoginTest extends BaseTest {

    @Test
    public void verifyTenforceScenario(){

        HomePage homePage = new HomePage(driver);
        CareersPage careerPage = new CareersPage(driver);
        JobOpeningPage jobOpeningPage = new JobOpeningPage(driver);
        CommonUtils commonUtils = new CommonUtils();

        test.info("Launching TenForce website");
        driver.get("https://www.tenforce.com/");

        test.info("Verify page title");
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle.trim(),"TenForce Software: EHSQ. Operational Risk. Data Intelligence");

        test.info("Accepting cookies");
        homePage.clickOnCookieAgreeButton();

        homePage.validateCareersLink();
        homePage.clickOnCareers();

        String careersPageTitle = driver.getTitle();
        Assert.assertEquals(careersPageTitle,"Сareer | TENFORCE");

        String text = careerPage.validateLifeAtTenforceText().getText();
        Assert.assertEquals(text, "LIFE AT TENFORCE");

        careerPage.clickOnLifeAtTenforceText();
        careerPage.clickOnlifeOfTwoInternsText();

        CommonUtils.scrollToEnd();
        test.info("Scrolling to end of page");

        driver.navigate().back();
        careerPage.clickOnjobOpeningsText();

        test.info("Verify job opening page text");
        String actualText = jobOpeningPage.validateFeelFreeText().getText();
        Assert.assertEquals(actualText, "Feel free to send your CV to");
    }
}
