/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class JavaScriptAlertsPage {
    //Driver
    private WebDriver driver;

    //Constructor
    public JavaScriptAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private final By result = By.id("result");

    //Dynamic Locator using string format
    String xPathTemplate = "//ul/li[%d]/button";

    //Method to handle dynamic locator
    public void clickButtonByIndex(int index){
        String buttons = String.format(xPathTemplate, index);
        driver.findElement(By.xpath(buttons)).click();
    }

    //Methods
    private void clickAlertButton(){
        clickButtonByIndex(1);
    }

    private void clickConfirmButton(){
        clickButtonByIndex(2);
    }

    private void clickPromptButton(){
        clickButtonByIndex(3);
    }

    public JavaScriptAlertsPage clickOnOkButton(){
        clickAlertButton();
        driver.switchTo().alert().accept();
        return this;
    }

    public JavaScriptAlertsPage clickOnCancelButton(){
        clickConfirmButton();
        driver.switchTo().alert().dismiss();
        return this;
    }

    public JavaScriptAlertsPage alertSetText(String value){
        clickPromptButton();
        driver.switchTo().alert().sendKeys(value);
        driver.switchTo().alert().accept();
        return this;
    }

    //Assertions
    public JavaScriptAlertsPage assertOnTextInput(String expectedText){
        Assert.assertEquals(driver.findElement(result).getText(), expectedText,
                "The alert text is incorrect.");
        return this;
    }

//    public void getAlertTriggerButton(By button){
//        driver.findElement(button).click();
//    }
}