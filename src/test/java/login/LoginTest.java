/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SecurePage;

public class LoginTest {

    private WebDriver driver;

    private HomePage homePage;
    private LoginPage loginPage;
    private SecurePage securePage;

    @Test
    public void LoginForm(){
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        securePage = new SecurePage(driver);

        driver.get("https://the-internet.herokuapp.com");
        homePage.clickLogin();

        //Method Channing
        loginPage.login("tomsmith", "SuperSecretPassword!").SubmitLoginForm();
        //loginPage.SubmitLoginForm();

        securePage.assertOnTextBox();
        //driver.getTitle();
    }
}