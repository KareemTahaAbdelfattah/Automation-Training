/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFrames {
    //Global Driver
    private WebDriver driver;
    private String topFrame = "frame-top";
    private String bottomFrame = "frame-bottom";
    private String leftFrame = "frame-left";
    private String rightFrame = "frame-right";
    private String middleFrame = "frame-middle";

    //Constructor
    public NestedFrames(WebDriver driver){
        this.driver = driver;
    }

    //locators
    private By body = By.tagName("body");

    //Methods
    public String getLeftFrame(){
        driver.switchTo().frame(topFrame).switchTo().frame(leftFrame);
        String LeftFrameText = driver.findElement(body).getText();

//        driver.switchTo().frame(topFrame); // Back to top frame
        driver.switchTo().defaultContent(); // Back to main frame
//        driver.switchTo().parentFrame(); // Back to main frame

        return LeftFrameText;
    }

    public String getBottomFrame(){
        driver.switchTo().frame(bottomFrame);
        String BottomFrameText = driver.findElement(body).getText();
        driver.switchTo().parentFrame(); // Back to main frame
        return BottomFrameText;
    }
}
