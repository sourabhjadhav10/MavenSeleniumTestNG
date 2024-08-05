import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
	WebDriver driver=new ChromeDriver();
	
	@BeforeTest
	public void setup() {
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void Login() {
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		String appHeader= driver.findElement(By.xpath("//div[@class=\"app_logo\"]")).getText();
		System.out.println(appHeader);
		Assert.assertEquals(appHeader,"Swag Labs");
		System.out.println("Logged in Successfully in app");
	}

}
