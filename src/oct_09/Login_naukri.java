package oct_09;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_naukri {
	WebDriver driver;
	@Before
	public void launchBrowser()
	{
		//driver=new FirefoxDriver();
		
		String filePath = System.getProperty("user.dir");
		System.out.println(filePath);
		
		System.setProperty("webdriver.chrome.driver", filePath + "//driver//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.naukri.com");
	}
	
	@Test
	public void test01(){
		//.driver.findElement(By.xpath(""))
		driver.findElement(By.id("qsbClick")).click();
		
		//driver.findElement(By.id("qsbClick")).sendKeys("manual testing");
		driver.findElement(By.name("qp")).sendKeys("Manual Testing");
	}
	
	@After
	public void closeBrowser(){
		
	}
}
