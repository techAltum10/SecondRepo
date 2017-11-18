package org.pacjageName.oct_15;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC04 {

	
		WebDriver driver;
		
		@Before
		public void launchBrowser(){
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.get("http://www.naukri.com");
		}
		
		@Test
		public void selectValueFromMouseOver() throws Exception{
			//Wait
			Thread.sleep(2000);
			
			//Mouse Over - More
			WebElement moreElement = driver.findElement(By.xpath("//span[@class='topIcon jobs More']"));
			
			//Use 'Actions' class
			Actions act = new Actions(driver);
			act.moveToElement(moreElement);
			act.build().perform();   //Pl Note - If u r using Actions class then use it
			
			Thread.sleep(1000);
			
			//Click on -- MCA
			//driver.findElement(By.xpath("//a[@title='MCA']")).click();
			WebElement mcaElement = driver.findElement(By.xpath("//a[@title='MCA']"));
			mcaElement.click();
		}
		
		@After
		public void quitBrowser(){
			//driver.quit();
		}
	}



