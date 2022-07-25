package webDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	
	@Test
	public void googleTest()
	{
//		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
//		WebElement search=driver.findElement(By.name("q"));
//		search.sendKeys("Java Tutorial");
		
		driver.findElement(By.xpath("//a[text()=\"Sign in\"]")).click();
		
		
		
	}

}
