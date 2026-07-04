/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Selenium Training
/** ==============================================**/
package route.c4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

//        By inputLink = By.xpath("//li/a[@href='/inputs']");
//        By inputLink_1 = By.cssSelector("a[href='/inputs']");
//        By inputLink_2 = By.linkText("Inputs");
//
//        driver.findElement(inputLink).click();
        List<WebElement> links = driver.findElements(By.tagName("a"));
//        for(WebElement link: links){
//            link.getSize();
//        }

        System.out.println("Number of links: " + links.size());

        //driver.close();
        driver.quit();
    }
}
