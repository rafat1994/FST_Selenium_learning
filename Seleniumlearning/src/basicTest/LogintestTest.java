package basicTest;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LogintestTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Student\\Downloads\\chromedriver_win32\\chromedriver.exe");

    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
	  
	    }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void logintest() {
    driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.manage().window().setSize(new Dimension(987, 537));
    driver.findElement(By.cssSelector("#divUsername > .form-hint")).click();
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    driver.findElement(By.id("txtPassword")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector("#menu_leave_viewLeaveModule > b")).click();
    driver.findElement(By.cssSelector(".odd:nth-child(1) > .left:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".odd:nth-child(1) > .left:nth-child(3)")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".odd:nth-child(1) > .left:nth-child(3)"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
//    assertThat(driver.findElement(By.cssSelector(".odd:nth-child(1) > .left:nth-child(3)")).getText(), is("CAN - Bereavement"));
//    driver.findElement(By.id("welcome")).click();
//    driver.findElement(By.linkText("Logout")).click();
  }
}
