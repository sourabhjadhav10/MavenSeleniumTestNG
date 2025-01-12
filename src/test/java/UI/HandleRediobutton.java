package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleRediobutton extends AutomationController {
    @Test
    public void redioButton() {
         driver.get("https://testautomationpractice.blogspot.com/");

          WebElement e =driver.findElement(By.xpath("//input[@id='male']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", e);
        e.click();

         driver.findElement(By.xpath("//input[@id='male']")).click();

    }
}
