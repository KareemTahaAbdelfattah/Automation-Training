/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package nestedFrame;

import base.Base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Frames;
import pages.NestedFrames;

import static org.testng.Assert.assertEquals;

public class FrameTest extends Base {
    private Frames frames;
    private NestedFrames nestedFrames;

    @BeforeMethod
    public void beforeMethod(){
        frames = new Frames(driver);
        nestedFrames = new NestedFrames(driver);
    }

    @Test
    public void frameTest(){
        homePage.clickFramesLink();
        frames.clickNestedFramesLink();
//        nestedFrames.getLeftFrame();
        assertEquals(nestedFrames.getLeftFrame(), "LEFT", "Your aren't on the correct Lframe");
//        nestedFrames.getBottomFrame();
        assertEquals(nestedFrames.getBottomFrame(), "BOTTOM", "Your aren't on the correct Bframe");
    }
}
