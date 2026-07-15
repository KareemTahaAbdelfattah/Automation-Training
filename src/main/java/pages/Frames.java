/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Frames {
    //Global Driver
    private WebDriver driver;

    //Constructor
    public Frames(WebDriver driver){
        this.driver = driver;
    }

    //locators
//    private final By NestedFrames = By.linkText("Nested Frames");
//    private final By IFrame = By.linkText("iFrame");

    //Methods
    public void clickNestedFramesLink(){
        clickLink("Nested Frames");
    }
    public void clickIFrameLink(){
        clickLink("iFrame");
    }
    public void clickLink(String link){
        driver.findElement(By.linkText(link)).click();
    }
}
