/** ==============================================**
 ** @Author: Kareem Taha Abd El-Fattah Mohammed
 ** @Category: Route Testing Diploma
 ** @brief: Automation Testing Training
/** ==============================================**/
package base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowManager;

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;

public class Base {
    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeMethod
    public void Setup(){
        driver = new ChromeDriver(getChromeOptions());
        homePage = new HomePage(driver);
        driver.get("https://the-internet.herokuapp.com");
        //driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardown(){
        //driver.quit();
    }

    @AfterMethod
    public void failureCapture(ITestResult result)
    {
        if(ITestResult.FAILURE == result.getStatus())
        {
            var screenshot = (TakesScreenshot) driver;
            File screenFile =  screenshot.getScreenshotAs(OutputType.FILE);

            try {
                Files.move(screenFile.toPath(), new File("src/main/resources/screenshots/" +
                        result.getName() + ".png").toPath());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private ChromeOptions getChromeOptions()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        //options.addArguments("--no-sandbox");

        //To allow to automate websites
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
        return options;
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
}