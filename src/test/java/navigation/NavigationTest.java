/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package navigation;

import base.Base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MultipleWindowsPage;
import utils.WindowManager;

public class NavigationTest extends Base {
    private MultipleWindowsPage multipleWindowsPage;
    private WindowManager windowManager;

    @BeforeMethod
    public void beforeMethod() {
        multipleWindowsPage = new MultipleWindowsPage(driver);
        windowManager = new WindowManager(driver);
    }

    @Test
    public void navigationTest() {
        homePage.clickMultipleWindowsLink();
        windowManager.refreshPage();
//        windowManager.gotToURL("https://google.com");
//        windowManager.goBack();
//        windowManager.goForward();
        multipleWindowsPage.clickLinkText();
        windowManager.switchTab("The Internet");
    }
}
