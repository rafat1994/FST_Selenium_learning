package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HRMLogin2_refactor {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Student\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void Teardown()
	{
		driver.close();
	}
	
	@Test
	public void verifyLogin() throws Exception
	{
	
		
		//locator
		//id
//		WebElement txt_username= driver.findElement(By.id("txtUsername")); 
//		txt_username.sendKeys("Admin");
		
		//name
//		WebElement txt_pwd=driver.findElement(By.name("txtPassword"));
//		txt_pwd.sendKeys("admin123");
		
		//classname
//		driver.findElement(By.className("button")).click();
		
		//tagname
//		driver.findElement(By.tagName("")).click();
		
		
		
		//partial linktext
//		driver.findElement(By.partialLinkText("Welcome")).click();
		
		
		
		
		//tagname
//		driver.findElement(By.tagName("")).click();
		
		Thread.sleep(3000);
		
		//linktext
//		driver.findElement(By.linkText("Logout")).click();
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		//xpath
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@class=\"cancel\"]")).click();
//		driver.findElement(By.xpath("//input[@value='Cancel']")).click();
		
		//css selector
		driver.findElement(By.cssSelector("input[value='Cancel']")).click();
		
		
	}

}
