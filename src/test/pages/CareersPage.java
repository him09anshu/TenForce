package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.CommonUtils;

public class CareersPage extends CommonUtils {

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
        WebElement lifeAtTenforce = waitForElement(driver, lifeAtTenforceText);
        clickWithJS(driver,lifeAtTenforce);
    }

    public WebElement validateLifeAtTenforceText(){
        waitForElement(driver,lifeAtTenforceText);
        return driver.findElement(lifeAtTenforceText);
    }

    public void clickOnlifeOfTwoInternsText(){
        WebElement lifeOfTwoInterns = waitForElement(driver,lifeOfTwoInternsText);
        clickWithJS(driver,lifeOfTwoInterns);
    }

    public void clickOnjobOpeningsText(){
        WebElement jobOpening = waitForElement(driver,jobOpeningsText);
        clickWithJS(driver,jobOpening);
    }

}
