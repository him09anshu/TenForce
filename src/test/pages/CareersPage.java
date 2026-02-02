package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtil;

import java.time.Duration;

public class CareersPage extends WaitUtil {

    WebDriver driver;

    public CareersPage(WebDriver driver){
        this.driver = driver;
    }

    public CareersPage() {

    }

    By lifeAtTenforceText = By.xpath("//a[@href='#people']");
    By lifeOfTwoInternsText = By.xpath("//span[contains(text(),'Life of two interns')]");
    By jobOpeningsText = By.xpath("//a[@href='#job']");

    public void clickOnLifeAtTenforceText(){
        waitForElement(driver, lifeAtTenforceText);
        driver.findElement(lifeAtTenforceText).click();
    }

    public WebElement validateLifeAtTenforceText(){
        waitForElement(driver,lifeAtTenforceText);
        return driver.findElement(lifeAtTenforceText);
    }

    public void clickOnlifeOfTwoInternsText(){
        waitForElement(driver,lifeOfTwoInternsText);
        driver.findElement(lifeOfTwoInternsText).click();
    }

    public void clickOnjobOpeningsText(){
        waitForElement(driver,jobOpeningsText);
        driver.findElement(jobOpeningsText).click();
    }

    public void scrollArticle() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        js.executeScript("window.scrollTo(0, 0)");
    }
}
