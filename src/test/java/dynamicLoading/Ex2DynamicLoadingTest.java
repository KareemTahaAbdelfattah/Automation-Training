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
import pages.Ex2DynamicLoadingPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Ex2DynamicLoadingTest extends Base {
    private DynamicLoadingPage dynamicLoadingPage;
    private Ex2DynamicLoadingPage ex2DynamicLoadingPage;

    @BeforeMethod
    public void beforeMethod(){
        dynamicLoadingPage = new DynamicLoadingPage(driver);
        ex2DynamicLoadingPage = new Ex2DynamicLoadingPage(driver);
    }

    @Test
    public void DynamicLoadingTest() {
        homePage.clickDynamicLoadingLink();
        dynamicLoadingPage.assertOnPageContent().clickExample2Link();;
        ex2DynamicLoadingPage.clickStartButton().assertOnFinishText();
    }
}