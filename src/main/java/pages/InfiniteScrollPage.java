/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    //Driver
    private WebDriver driver;

    //Constructor
    public InfiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }

    //Locators
    private By paragraph = By.className("jscroll-added");

    //Methods
    public void scrollToParagraph(int index){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "window.scrollBy(0,150)";  // Vertical scroll by 1000 pixels
        js.executeScript(script);

        while(getNumberOfParagraph() < index){
            js.executeScript(script);
        }
    }

    public int getNumberOfParagraph(){
        return driver.findElements(paragraph).size();  // Number of paragraphs
    }
}