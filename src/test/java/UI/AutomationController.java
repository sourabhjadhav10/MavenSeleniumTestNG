package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class AutomationController {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown()
    {
//        driver.quit();
    }

    public boolean isElementPresent(By locatorKey) {
        try{
            driver.findElement(locatorKey);
            return true;
        }
        catch (NoSuchElementException e)
        {
            return false;
        }
    }

}
