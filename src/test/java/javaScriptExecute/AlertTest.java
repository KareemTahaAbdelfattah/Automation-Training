/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package javaScriptExecute;

import base.Base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.JavaScriptAlertsPage;

public class AlertTest extends Base {
    JavaScriptAlertsPage javaScriptAlertsPage;

    @BeforeMethod
    public void beforeMethod()
    {
        homePage = new HomePage(driver);
        javaScriptAlertsPage = new JavaScriptAlertsPage(driver);
    }

    @Test
    public void alertTest()
    {
        homePage.clickJavaScriptAlertLink();
        javaScriptAlertsPage.clickOnOkButton().assertOnTextInput("You successfully clicked an alert");
    }

    @Test
    public void confirmTest()
    {
        homePage.clickJavaScriptAlertLink();
        javaScriptAlertsPage.clickOnCancelButton().assertOnTextInput("You clicked: Cancel");
    }

    @Test
    public void promptTest()
    {
        String prompt = "Kareem";
        homePage.clickJavaScriptAlertLink();
        javaScriptAlertsPage.alertSetText(prompt).assertOnTextInput("You entered: " + prompt);
    }
}