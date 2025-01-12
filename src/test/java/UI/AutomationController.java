package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AutomationController {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
       driver=new ChromeDriver();
       driver.manage().window().maximize();
     //  driver.get("https://www.saucedemo.com/");
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
        catch (org.openqa.selenium.NoSuchElementException e)
        {
            return false;
        }
    }

}
