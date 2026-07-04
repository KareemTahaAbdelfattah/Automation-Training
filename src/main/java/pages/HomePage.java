/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    //Global Driver
    private WebDriver driver;

    //Constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //locators
    private By loginPage = By.linkText("Form Authentication");

    //Methods
    public void clickLoginLink(){
        driver.findElement(loginPage).click();
    }
}