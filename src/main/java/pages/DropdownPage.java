/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropdownPage {

    //Driver
    private WebDriver driver;

    //Constructor
    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    //Locators
    private By dropdown = By.id("dropdown");

    //Methods
    //Select option from dropdown
    public void selectFromDropdownOptions(String option){
        findDropdownElements().selectByVisibleText(option);
    }

    public List<String> getDropdownList(){
        //Click on the dropdown, then try to select an option
        List<WebElement> optionsInDropdown = findDropdownElements().getAllSelectedOptions();

        List<String> optionText = new ArrayList<>();
        for(WebElement option: optionsInDropdown){
            optionText.add(option.getText());
        }
        return optionText;
    }

    private Select findDropdownElements(){
        return new Select(driver.findElement(dropdown));
    }
}