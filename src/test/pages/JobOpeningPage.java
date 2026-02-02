package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtil;

import java.time.Duration;

public class JobOpeningPage extends WaitUtil {

    WebDriver driver;

    public JobOpeningPage(WebDriver driver){
        this.driver=driver;
    }

    By feelFreeText = By.xpath("//span[contains(text(),'Feel free')]");


    public WebElement  validateFeelFreeText(){
        waitForElement(driver,feelFreeText);
        return driver.findElement(feelFreeText);
    }
}
