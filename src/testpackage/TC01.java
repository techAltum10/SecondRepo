package testpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC01 {

	//Dec WebDriver
	WebDriver driver;
	@Before
	public void openBrowser(){
		
		String filePath = System.getProperty("user.dir");

		//System.setProperty("webdriver.gecko.driver", filePath + "//driver//geckodriver.exe");
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", filePath + "//driver//chromedriver.exe");
		driver = new ChromeDriver();
		
		
		/*System.setProperty("webdriver.edge.driver", filePath + "//driver//edgedriver.exe");
		driver = new EdgeDriver();*/
		
		driver.manage().window().maximize();
		
		driver.get("http://www.gmail.com");
	}
	
	@Test
	public void testCase01(){
		driver.findElement(By.id("identifierId")).sendKeys("atyagi.mails");
		
		
	}
	
	@After
	public void closeBrowser(){
		//driver.quit();
		//driver.close();
	}
	
}
