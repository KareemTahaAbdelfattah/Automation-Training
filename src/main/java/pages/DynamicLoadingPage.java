/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;

public class DynamicLoadingPage {
    //Variables
    public String expectedContent = "Dynamically Loaded Page Elements";

    // Driver
    private WebDriver driver;

    // Constructor
    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    //Locators
//    private final By firstEx = By.partialLinkText("Example 1");
//    private final By secondEx = By.partialLinkText("Example 2");
    private final By contentHeader = By.xpath("//div/h3");

    //Methods
    public void clickExample1Link(){
        clickLink("Example 1");
    }
    public void clickExample2Link(){
        clickLink("Example 2");
    }
    private DynamicLoadingPage clickLink(String link){
        driver.findElement(By.partialLinkText(link)).click();
        return this;
    }

    //Assertions
    public DynamicLoadingPage assertOnPageContent(){
        assertEquals(driver.findElement(contentHeader).getText(), expectedContent, "Page content is not correct");
        return this;
    }
}