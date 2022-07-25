package CrossbrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMLoginCrossBrowser {
	
	WebDriver driver;
	
	@Parameters("ibm_br")
	@BeforeTest
	public void setup(String browsername)
	{
		
		
//		String browserName="hbhbj";
		
		System.out.println("browser details:  "+browsername);
		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	}

	@AfterTest
	public void teardown()
	{
		driver.close();

	}

	@Test //(priority = 1)
	public void loginTest()
	{
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

	}
	
	@Test //(priority = 4)
	public void logoutTest() throws InterruptedException
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
	}

}
