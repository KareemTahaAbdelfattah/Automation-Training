/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    //Global Driver
    private WebDriver driver;

    //Constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //locators
    private final By UserName = By.id("username");
    private final By Password = By.name("password");
    private final By LoginButton = By.xpath("//button");

    //Methods
    public LoginPage login(String user, String pass){
        driver.findElement(UserName).sendKeys(user);
        driver.findElement(Password).sendKeys(pass);
        return this;
    }

    public LoginPage SubmitLoginForm(){
        driver.findElement(LoginButton).click();
        return this;
    }
}