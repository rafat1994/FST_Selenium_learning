package basicTest;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class seltestscript {

	@Test
	public void login()
	{
		//driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Student\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch app
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//close browser
		driver.close();
	}
}
