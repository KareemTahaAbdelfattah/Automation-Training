/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage {
    //Global Driver
    private WebDriver driver;

    //Constructor
    public SecurePage(WebDriver driver){
        this.driver = driver;
    }

    //Variable
    private final String text = "Secure Area";

    //locators
    private By TextBox = By.xpath("//h2[text() = ' Secure Area']");

    //Methods
    public SecurePage assertOnTextBox(){
        // Assert Locator
        String actualText = driver.findElement(TextBox).getText();
        String expectedText = text;

        if(actualText.equals(expectedText)) System.out.println("Assertion Passed: Text is Correct");
        else System.out.println("Assertion Failed: Text is InCorrect");
        return this;
    }
}
