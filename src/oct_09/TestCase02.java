package oct_09;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase02 {
	WebDriver driver;
	
	@Before
	public void launchBrowser(){
		//Open Browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Enter URL
		driver.get("http://www.google.com");
		
		//imp wait - applicable to all elements
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Test
	public void testCase02() throws Exception{
		driver.findElement(By.id("lst-ib")).sendKeys("java");
		Thread.sleep(3000);
		
		String a ="//html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div/ul/li[";
		int i =1;
		String b= "]/div/div[2]";
		String xpGoogle = a+i+b;
		
		
		//Exp Wait - applicable for one element
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpGoogle)));
		
		WebElement googleSuggestionList = driver.findElement(By.xpath(xpGoogle));
		
		try{
			while(googleSuggestionList.isDisplayed()){
				xpGoogle = a+i+b;
				
				 String googleSuggestionListText = driver.findElement(By.xpath(xpGoogle)).getText();
				 System.out.println(googleSuggestionListText);
				 
				 if(googleSuggestionListText.equalsIgnoreCase("javatpoint")){
					 driver.findElement(By.xpath(xpGoogle)).click();
					 System.out.println("Element found and clicked."); 
					 Thread.sleep(1000);
					 
					 String selectValue = driver.findElement(By.id("lst-ib")).getAttribute("value");
					 System.out.println("Selected value is - " + selectValue);
				 }
				 
				 i++;
			}
		}
		catch(Exception e){
			
			System.out.println("All element has been read.");
		}
	}
	
	@After
	public void quitBrowser(){
		//driver.quit();
	}

}
