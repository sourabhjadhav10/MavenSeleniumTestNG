package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoActtions extends AutomationController
{
    @Test
    public void rightClick()
    {
        Actions a = new Actions(driver);
        WebElement e = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
        a.contextClick().perform();
    }

    @Test
    public void mouseover()
    {
        driver.get("https://stqatools.com/demo/MouseHover.php");
        Actions ac = new Actions(driver);
        WebElement w = driver.findElement(By.xpath("//button[@class=\"dropbtn\"]"));
        ac.moveToElement(w).perform();
        driver.findElement(By.xpath("//a[@type=\"button\" and text()=\"Link 1\"]")).click();
       // driver.navigate().refresh();
       // driver.get(driver.getCurrentUrl());
       // driver.navigate().to(driver.getCurrentUrl());
        driver.navigate().back();

    }

    @Test
    public void backMethod()
    {
       // driver.get("https://www.saucedemo.com/");
        driver.navigate().to("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
        driver.navigate().back();
        driver.navigate().forward();
    }

    @Test
    public void mouseover2()
    {
        driver.navigate().to("https://demo.automationtesting.in/Windows.html");
        Actions a = new Actions(driver);
        WebElement e = driver.findElement(By.xpath("//a[text()=\"SwitchTo\"]"));
        a.moveToElement(e).perform();

        WebElement wt = driver.findElement(By.xpath("//a[text()=\"Interactions \"]"));
        a.moveToElement(wt).perform();

        WebElement w = driver.findElement(By.xpath("//a[text()=\"Video\"]"));
        a.moveToElement(w).perform();

        WebElement t = driver.findElement(By.xpath("//a[text()=\"WYSIWYG\"]"));
        a.moveToElement(t).perform();

        WebElement element = driver.findElement(By.xpath("//a[text()=\"More\"]"));
        a.moveToElement(element).perform();

        driver.findElement(By.xpath("//a[text()=\"Charts\"]")).click();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        WebElement ew = driver.findElement(By.xpath("(//a[@class=\"btn btn-default\"])[2]"));
        ew.click();

    }
}
