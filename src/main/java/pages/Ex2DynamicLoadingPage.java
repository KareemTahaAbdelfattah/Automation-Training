/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.testng.Assert.assertEquals;

public class Ex2DynamicLoadingPage {
    //Variables
    public String expectedContent = "Dynamically Loaded Page Elements";
    public String finishContent = "Hello World!";
    FluentWait<WebDriver> wait;

    // Driver
    private WebDriver driver;

    // Constructor
    public Ex2DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
        wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);
    }

    //Locators
    private final By startButton = By.xpath("//div/button");
    private final By finishText = By.cssSelector("#finish > h4");
    private final By loadingBar = By.id("loading");

    //Methods
    public Ex2DynamicLoadingPage clickStartButton(){
        driver.findElement(startButton).click();
        return this;
    }

    public Ex2DynamicLoadingPage click(){
        driver.findElement(startButton).click();
        return this;
    }

    //Assertions
    public Ex2DynamicLoadingPage assertOnFinishText(){
//        wait.until(d -> driver.findElement(finishText).isDisplayed());  //Wait lambda
        wait.until(ExpectedConditions.visibilityOfElementLocated(finishText));

        assertEquals(driver.findElement(finishText).getText(), finishContent, "Finish text is not correct");
        return this;
    }
}