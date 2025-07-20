	package UI;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.Assert;
	import org.testng.annotations.*;

	public class FirstTest {
		WebDriver driver;

		@BeforeMethod
		public void setup() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
		}

		@AfterMethod
		public void tearDown() {
			driver.quit();
		}


		@Test
		public void Login() {
			driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_use");
			driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
			String appHeader = driver.findElement(By.xpath("//div[@class=\"app_logo\"]")).getText();
			System.out.println(appHeader);
			Assert.assertEquals(appHeader, "Swag Labs");
			System.out.println("Logged in Successfully in app");
		}
	}

