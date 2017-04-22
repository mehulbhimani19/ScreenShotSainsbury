package Software;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Created by Mehul on 07/12/2016.
 */
public class TestSuits extends DriverManager
{
    @Test
    public static void ScreenShortEveryTime ()
    {

        Actions action = new Actions(driver);
        WebElement DepartmentSelection = driver.findElement(By.xpath(".//*[@id='mainNavGroceriesLink']/span"));   // action Hover class
        action.moveToElement(DepartmentSelection).build().perform();


//        TakesScreenshot ts =  (TakesScreenshot) driver;       // need to throw exeption or make with try and catch
//        File source = ts.getScreenshotAs((OutputType.FILE));
//        FileUtils.copyFile(source,new File("src\\test\\ScreenShort\\ScreenShort.jpg"));

        Utility.captureScreenShort(driver, "Homepage");     // screen short

//      driver.findElement(By.xpath(".//*[@id='menuBar']/li[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        driver.findElement(By.xpath(".//*[@id='menuBar']/li[1]/div/div/div/div[1]/ul/li[3]/a.11")).click(); // wron x path for fail

//        Utility.captureScreenShort("department");
    }

        @AfterMethod
        public static void ScreenShortWhenFail (ITestResult result )
        {
           if (ITestResult.FAILURE==result.getStatus())
           {
             Utility.captureScreenShort( driver,result.getName());
           }
           driver.quit();
        }







}
