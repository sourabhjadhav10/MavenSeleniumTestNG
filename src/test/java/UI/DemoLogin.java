package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoLogin extends AutomationController {


    @Test
    public void Loginpage()
    {
        driver.get("https://users.wix.com/signin?view=sign-up&sendEmail=true&loginCompName=SignUp_H&referralInfo=SignUp_H&postSignUp=https%3A%2F%2Fwww.wix.com%2Fnew%2Fintro%2F&postLogin=https%3A%2F%2Fmanage.wix.com%2Faccount%2Froute&loginDialogContext=login&originUrl=https%3A%2F%2Fwww.wix.com%2F&forceRender=true");
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("adamapurerutuja@gmail.com");
        driver.findElement(By.xpath("//span[text()=\"Continue with Email\"]")).click();

    }
}
