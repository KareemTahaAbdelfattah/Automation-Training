/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {
    //Driver
    private WebDriver driver;

    //Constructor
    public MultipleWindowsPage(WebDriver driver){
        this.driver = driver;
    }

    //Locators
    private By linkText = By.linkText("Click Here");

    //Methods
    public MultipleWindowsPage clickLinkText(){
        driver.findElement(linkText).click();
        return this;
    }
}
