package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.CommonUtils;

public class HomePage extends CommonUtils {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    By careersLink = By.xpath("//*[contains(text(),'Careers')]");
    By cookieAgreeButton = By.xpath("//*[contains(@class,'gdpr-agreement')]");

    public void clickOnCareers(){
        WebElement careers = waitForElement(driver,careersLink);
        scrollToEnd();
        clickWithJS(driver,careers);
    }

    public boolean validateCareersLink(){
        waitForElement(driver,careersLink);
        return driver.findElement(careersLink).isDisplayed();
    }

    public void clickOnCookieAgreeButton() {
        WebElement agreeButton = waitForElement(driver,cookieAgreeButton);
        clickWithJS(driver,agreeButton);
        waitForInvisibility(driver,cookieAgreeButton);
    }

}
