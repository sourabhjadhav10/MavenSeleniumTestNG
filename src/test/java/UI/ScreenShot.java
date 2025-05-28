package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenShot extends AutomationController
{
    //full page of shoot
    @Test
    public void demosreen() throws IOException {
        driver.get("https://www.amazon.in/");
        TakesScreenshot ts =(TakesScreenshot) driver;
        File f = ts.getScreenshotAs(OutputType.FILE);
        File fl = new File("C:\\Users\\ADMIN\\Pictures\\Saved Pictures\\Shoot.png");
        FileHandler.copy(f,fl);

    }
    @Test
    public void section() throws IOException {
        driver.get("https://www.amazon.in/");
        WebElement ele = driver.findElement(By.xpath("//div[@id=\"nav-logo\"]"));
        ele.isDisplayed();
        TakesScreenshot t = (TakesScreenshot) driver;
        File s = ele.getScreenshotAs(OutputType.FILE);
        File q = new File("C:\\Users\\ADMIN\\Pictures\\Saved Pictures\\logo.png");
        FileHandler.copy(s, q);
    }

    @Test
    public void takeScreenshot() throws IOException {
        File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destination=new File("screenshot.png");
        FileHandler.copy(source,destination);
    }

}
