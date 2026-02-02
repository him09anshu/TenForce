package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import utils.WaitUtil;

import java.time.Duration;

public class HomePage extends WaitUtil {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    By careersLink = By.xpath("//*[contains(text(),'Careers')]");
    By cookieAgreeButton = By.xpath("//*[contains(@class,'gdpr-agreement')]");

    public void clickOnCareers(){
        waitForElement(driver,careersLink);
        scrollTo(driver.findElement(careersLink));
        driver.findElement(careersLink).click();
    }

    public boolean validatecareersLink(){
        waitForElement(driver,careersLink);
        return driver.findElement(careersLink).isDisplayed();
    }

    public void clickOnCookieAgreeButton() {
        waitForElement(driver,cookieAgreeButton);
        driver.findElement(cookieAgreeButton).click();
    }

}
