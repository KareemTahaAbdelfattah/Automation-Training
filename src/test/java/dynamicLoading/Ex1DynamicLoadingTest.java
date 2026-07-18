/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package dynamicLoading;

import base.Base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DropdownPage;
import pages.DynamicLoadingPage;
import pages.Ex1DynamicLoadingPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Ex1DynamicLoadingTest extends Base {
    private DynamicLoadingPage dynamicLoadingPage;
    private Ex1DynamicLoadingPage ex1DynamicLoadingPage;

    @BeforeMethod
    public void beforeMethod(){
        dynamicLoadingPage = new DynamicLoadingPage(driver);
        ex1DynamicLoadingPage = new Ex1DynamicLoadingPage(driver);
    }

    @Test
    public void DynamicLoadingTest() {
        homePage.clickDynamicLoadingLink();
        dynamicLoadingPage.assertOnPageContent().clickExample1Link();
        ex1DynamicLoadingPage.clickStartButton().assertOnFinishText();
    }
}