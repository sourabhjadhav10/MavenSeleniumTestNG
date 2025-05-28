package UI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Alerthandlingusingexplicitwait extends AutomationController
{
    @Test
    public void alertWait()
    {
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(5)); //explicit wait
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

        Alert mywait =wt.until(ExpectedConditions.alertIsPresent());
         mywait.accept();

    }
}
