import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Login extends AutomationController{

    @Test(priority = 1)
    public void login(){
        // write code to login
        driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class=\"app_logo\"]")).getText(),"Swag Labs");
        System.out.println("Logged in Successfully");
    }

    @Test(priority = 2)
    public void testInvalid()
    {
        // Login with lockout user and validating getting error message
        driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("locked_out_user");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();

        String error=driver.findElement(By.xpath("//h3[@data-test=\"error\"]")).getText();

        Assert.assertEquals(error,"Epic sadface: Sorry, this user has been locked out.");

        // closing error message and validating error message is not displaying
        driver.findElement(By.xpath("//button[@class=\"error-button\"]")).click();
        Assert.assertFalse(isElementPresent(By.xpath("//h3[@data-test=\"error\"]")));

    }

    @Test(priority = 3)
    public void louOut(){
        driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();

        driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"Logout\"]")).click();

       WebElement loginPage = driver.findElement(By.xpath("//div[@class='login_wrapper-inner']"));

         Assert.assertTrue( loginPage.isDisplayed(),"Login page is display");

        System.out.println("In logout method");
    }


}
