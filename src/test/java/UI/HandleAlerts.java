package UI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleAlerts extends AutomationController
{
    @Test
    public void normalAlert()
    {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //1) normal alert with ok button

      /*  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        driver.switchTo().alert().accept(); // close alert using ok button

        Alert myalert = driver.switchTo().alert();
        System.out.println(myalert.getText());
        myalert.accept();*/

        // 2)conformation alert with ok and cancel button

      //  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

       // driver.switchTo().alert().accept(); //close alert using ok button
       // driver.switchTo().alert().dismiss(); //close alert using cancel button

      /*  Alert confalert = driver.switchTo().alert();
        System.out.println(confalert.getText());
        confalert.dismiss();
       // driver.switchTo().alert().getText(); */


        //3) Prompt alert

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert promptalert = driver.switchTo().alert();
        promptalert.sendKeys("welcome");
        System.out.println(promptalert.getText());
        promptalert.accept();

    }
}
