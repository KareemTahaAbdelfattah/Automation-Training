/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Selenium Training
/** ==============================================**/
package route.c4;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
        static WebDriver driver = new ChromeDriver();

        public static void navigateTo(){
                driver.get("https://www.amazon.eg/ref=nav_logo");

                driver.manage().window().maximize();
                //driver.manage().window().minimize();

                //driver.manage().window().setSize(new Dimension(1366, 1200));
                System.out.println(driver.getTitle());

                driver.close();
                //driver.quit();
        }
}