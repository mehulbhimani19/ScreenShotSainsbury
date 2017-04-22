package Software;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

import static Software.DriverManager.driver;
import static java.lang.Math.random;

/**
 * Created by Mehul on 07/12/2016.
 */
public class Utility
{
    public static void actionHover(WebElement element)
    {
        Actions action = new Actions(driver);
//        WebElement DepartmentSelection = driver.findElement(By.xpath(".//*[@id='mainNavGroceriesLink']/span"));
        action.moveToElement(element).build().perform();
    }

    public static void captureScreenShort(WebDriver driver , String name)  //
    {
        TakesScreenshot ts =  (TakesScreenshot) DriverManager.driver;
        File source = ts.getScreenshotAs((OutputType.FILE));

        try {
            FileUtils.copyFile(source,new File("src\\test\\ScreenShort\\"+random()+name+".jpg"));
        }
        catch (IOException e)
        {System.out.println("Exeption while taking screenshort" + e.getMessage());
            System.out.println("Screen Short taken ");
        }
    }
}
