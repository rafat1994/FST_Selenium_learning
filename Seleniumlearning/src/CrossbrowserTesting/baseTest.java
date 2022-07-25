package CrossbrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {

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
}
