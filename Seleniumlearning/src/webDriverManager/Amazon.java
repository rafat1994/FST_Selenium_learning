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

public class Amazon {
	WebDriver driver;
		
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
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
		
		
		WebElement amazonSearch= driver.findElement(By.id("twotabsearchtextbox"));
		amazonSearch.sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		String Expectedtitle="Amazon.com : iphone";
		String Actualtitle= driver.getTitle();
		System.out.println(Actualtitle);
		Assert.assertEquals(Actualtitle, Expectedtitle);
				
		WebElement iphonespacegray= driver.findElement(By.xpath("//span[contains(text(),\"Space Gray\")]"));
		iphonespacegray.click();
		
//		WebElement loginbtn=driver.findElement(By.xpath("//button[text()=\"Log in\"]"));
//		loginbtn.click();
		
		String expectedprodtitle="Amazon.com: Apple iPhone 11 Pro, 64GB, Space Gray - Unlocked (Renewed) : Electronics";
		String Actualprodtitle= driver.getTitle();
		System.out.println(Actualprodtitle);
		Assert.assertEquals(Actualprodtitle, expectedprodtitle);
		

	}
	

}
