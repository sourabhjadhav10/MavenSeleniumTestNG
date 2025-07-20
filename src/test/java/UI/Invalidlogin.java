    package UI;

    import org.openqa.selenium.By;
    import org.testng.Assert;
    import org.testng.annotations.Test;
    
    public class Invalidlogin extends AutomationController {

        @Test
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
    }
