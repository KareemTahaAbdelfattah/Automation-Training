/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package infiniteScroll;

import base.Base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;

public class InfiniteScrollTest extends Base {
    private InfiniteScrollPage infiniteScrollPage;

    @BeforeMethod
    private void beforeMethod()
    {
        infiniteScrollPage = new InfiniteScrollPage(driver);
    }

    @Test
    public void infiniteScrollPageTest()
    {
        homePage.clickInfiniteScrollLink();
        infiniteScrollPage.scrollToParagraph(10);
        System.out.println(infiniteScrollPage.getNumberOfParagraph());
    }
}