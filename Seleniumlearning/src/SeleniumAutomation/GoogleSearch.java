package SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearch {
	
	@Test
	public void googleTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Student\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
//		WebElement search=driver.findElement(By.name("q"));
//		search.sendKeys("Java Tutorial");
		
		driver.findElement(By.xpath("//a[text()=\"Sign in\"]")).click();
		driver.close();
		
		
		
	}

}
