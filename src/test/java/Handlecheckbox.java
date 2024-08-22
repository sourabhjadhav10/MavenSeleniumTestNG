import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Handlecheckbox extends AutomationController
{
    @Test
    public void checkbox() throws InterruptedException {
        driver.get("https://testautomationpractice.blogspot.com/");
        //select specific checkbox
        WebElement e = driver.findElement(By.xpath("//input[@id='sunday']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", e);

        //driver.findElement(By.xpath("//input[@id='sunday']")).click();

        // select all checkboxes

        List <WebElement> cb = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));

     /*   for(int i=0; i<cb.size(); i++)
        {
            cb.get(i).click();
        }*/

       /*
        for( WebElement bc:cb)
        {
            bc.click();
        }*/

        //select last 3 checkboxes
        //total no of checkboxes - how many checkboxes want to select =start index

       /* for(int i=4; i<cb.size(); i++)
        {
            cb.get(i).click();
        }*/

        //select 1st 3 checkboxes

       /* for(int i=0; i<3; i++)
        {
            cb.get(i).click();
        }*/

       /* for(int i=3; i<5; i++)
        {
            cb.get(i).click();
        }*/

        //unselect checkboxes if they are selected

        for (int i=0; i<3; i++)
        {
            cb.get(i).click();
        }

        Thread.sleep(5000);

        for(int i=0; i<cb.size(); i++)
        {
            if(cb.get(i).isSelected())
            {
                cb.get(i).click();
            }
        }
    }
}
