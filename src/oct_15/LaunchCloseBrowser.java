package oct_15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchCloseBrowser {

WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String browser){
		String browserDriverExePath = System.getProperty("user.dir");
		System.out.println("Project Path is - " + browserDriverExePath);
		
		if(browser.equalsIgnoreCase("firefox")){
			//Open FF
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			//Open Chrome
			System.setProperty("webdriver.chrome.driver", browserDriverExePath + "//driver//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else{
			//Open IE
			System.setProperty("webdriver.ie.driver", browserDriverExePath + "//driver//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void quitBrowser(){
		driver.quit();
	}
}
