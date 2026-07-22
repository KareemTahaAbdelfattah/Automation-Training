/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package notificationMessage;

import base.Base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.NotificationMessagePage;

public class NotificationMessageTest extends Base {
    private NotificationMessagePage notificationMessagePage;

    @BeforeMethod
    public void beforeMethod() {
        notificationMessagePage = new NotificationMessagePage(driver);
    }

    @Test
    public void notificationMessageTest() {
        homePage.clickNotificationMessageLink();
        notificationMessagePage.clickLinkText().assertNotificationMessageDisplayed();
    }
}
