/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    //Global Driver
    private WebDriver driver;

    //Constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //locators
//    private By loginPage = By.linkText("Form Authentication");
//    private By dropdownLink = By.linkText("Dropdown");

    //Methods
//    public void clickLoginLink(){
//        driver.findElement(loginPage).click();
//    }
//    public void clickDropdownLink(){
//        driver.findElement(dropdownLink).click();
//    }
    public void clickLogin(){
        clickLink("Form Authentication");
    }
    public void clickDropdown(){
        clickLink("Dropdown");
    }
    public void clickFramesLink(){
        clickLink("Frames");
    }
    public void clickDynamicLoadingLink(){
        clickLink("Dynamic Loading");
    }
    public void clickLink(String link){
        driver.findElement(By.linkText(link)).click();
    }
}