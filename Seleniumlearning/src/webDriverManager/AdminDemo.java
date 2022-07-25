package webDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;

public class AdminDemo {
	WebDriver driver;
		
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	@Test
	public void admindemoTest()
	{
		
		
		WebElement Email= driver.findElement(By.xpath("//input[@id=\"Email\"]"));
		Email.clear();
		Email.sendKeys("admin@yourstore.com");
		
		WebElement password= driver.findElement(By.id("Password"));
		password.clear();
		password.sendKeys("admin");
		
		WebElement RememberMeChkBox= driver.findElement(By.id("RememberMe"));
		RememberMeChkBox.click();
		
		WebElement loginbtn=driver.findElement(By.xpath("//button[text()=\"Log in\"]"));
		loginbtn.click();
		
		String Expectedtitle="Dashboard / nopCommerce administration";
		String Actualtitle= driver.getTitle();
		System.out.println(Actualtitle);
		Assert.assertEquals(Actualtitle, Expectedtitle);
		

	}
	
//	@Test
//	public void VerifyTitle()
//	{
//				
//	}

}
