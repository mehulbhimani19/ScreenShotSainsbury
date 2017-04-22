package Software;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Mehul on 07/12/2016.
 */
public class DriverManager
{
    protected static WebDriver driver;

    public DriverManager(){
        PageFactory.initElements(driver, this);
    }
   @BeforeMethod
    public static void OpenBrowser()
    {    driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.sainsburys.co.uk/");

    }

//    @AfterMethod
//
//    public static void closeBrowser()
//    {
////        driver.quit();
//    }

}

