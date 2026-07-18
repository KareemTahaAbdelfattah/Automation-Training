/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.testng.Assert.assertEquals;

public class Ex1DynamicLoadingPage {
    //Variables
    public String expectedContent = "Dynamically Loaded Page Elements";
    public String finishContent = "Hello World!";

    // Driver
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public Ex1DynamicLoadingPage(WebDriver driver){
        this.driver = driver;

        //Thread
//        Thread.sleep(5000);
        //Implicit Wait
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // poll every 0.5 sec
        //Explicit Wait => poll every 0.5 sec
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //Locators
    private final By startButton = By.xpath("//div/button");
    private final By finishText = By.cssSelector("#finish > h4");
    private final By loadingBar = By.id("loading");

    //Methods
    public Ex1DynamicLoadingPage clickStartButton(){
        driver.findElement(startButton).click();
        return this;
    }

    public Ex1DynamicLoadingPage click(){
        wait.until(ExpectedConditions.elementToBeClickable(startButton));
        driver.findElement(startButton).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingBar));
//        wait.until(ExpectedConditions.presenceOfElementLocated(finishText));
        return this;
    }

    //Assertions
    public Ex1DynamicLoadingPage assertOnFinishText(){
        wait.until(ExpectedConditions.presenceOfElementLocated(finishText));
        assertEquals(driver.findElement(finishText).getText(), finishContent, "Finish text is not correct");
        return this;
    }
}