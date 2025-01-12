package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;

public class Demoscreenshot extends AutomationController


{
    @Test
    public void screenShot() throws IOException {
        driver.get("https://www.amazon.in/");
        //full page screenshot

      /* TakesScreenshot ts = (TakesScreenshot) driver;
       File src = ts.getScreenshotAs(OutputType.FILE);
       File trg = new File(".\\target\\homepage.png");
       FileHandler.copy(src, trg);*/

        //screenshot of section of the page

      /*  WebElement section= driver.findElement(By.xpath("//div[@id='CardInstanceCxdSiDva2Wigxf2FpJD6VQ']"));
        File src = section.getScreenshotAs(OutputType.FILE);
        File trg = new File(".\\target\\Section.png");
        FileHandler.copy(src, trg);
        driver.close();*/

     // Srceershot of element on the page

        WebElement lg = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        File sr = lg.getScreenshotAs(OutputType.FILE);
        File tg = new File(".\\target\\logo.png");
        FileHandler.copy(sr, tg);
        driver.close();
    }
}
