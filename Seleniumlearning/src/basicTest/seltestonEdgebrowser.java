package basicTest;

import org.junit.Test;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class seltestonEdgebrowser {

	@Test
	public void login()
	{
		//driver path
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Student\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		//launch chrome browser
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		//launch app
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//close browser
		driver.close();
	}
}
