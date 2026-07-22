/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NotificationMessagePage {
    //Driver
    private WebDriver driver;

    //Constructor
    public NotificationMessagePage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By linkText = By.linkText("Click here");
    private By notificationMessage = By.id("flash");

    //Methods
    public NotificationMessagePage clickLinkText() {
        driver.findElement(linkText).click();
        return this;
    }

    //Assertions
    public NotificationMessagePage assertNotificationMessageDisplayed() {
        Assert.assertEquals(driver.findElement(notificationMessage).getText(),
                " Action successful", "Notification Message is not displayed");
        return this;
    }
}