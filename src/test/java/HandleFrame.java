import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleFrame extends AutomationController
{
    @Test
    public void frames()
    {
        driver.get("https://demo.automationtesting.in/Frames.html");

       driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();

       WebElement outerframe = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
       driver.switchTo().frame(outerframe);

       WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
       driver.switchTo().frame(innerframe);

       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("welcome");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();

    }


    @Test
    public void innerframes()
    {
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");

        driver.switchTo().frame("iframeResult");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"demo_iframe.htm\"]")));

       System.out.println("print line ==> " +driver.findElement(By.xpath("//h1[normalize-space()='This page is displayed in an iframe']")).getText());
        driver.switchTo().parentFrame();

      String e =  driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to spe')]")).getText();
      System.out.println(e);
}
}
