/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package dropdown;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DropdownPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SecurePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends Base {
    private DropdownPage dropdownPage;
    private String Option = "Option 1";

    @BeforeMethod
    public void beforeMethod(){
        dropdownPage = new DropdownPage(driver);
    }

    @Test
    public void selectDropdownOptions() {
        homePage.clickDropdown();
        dropdownPage.selectFromDropdownOptions(Option);

        var SelectedOption = dropdownPage.getDropdownList();
        assertEquals(SelectedOption.size(), 1, "The size is incorrect");
        assertTrue(SelectedOption.contains(Option), "The option is incorrect");
    }
}