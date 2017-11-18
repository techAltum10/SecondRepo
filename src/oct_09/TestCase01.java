package oct_09;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase01 {
	WebDriver driver;
	
	@Before
	public void launchBrowser(){
		//Open Browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Enter URL
		driver.get("http://www.onetravel.com");
	}
	@Test
	public void testCase01(){
		//Close Popup
		driver.findElement(By.xpath("//a[@class = 'signupClose icon ic-cancel-fill']")).click();
		System.out.println("Close Popup");
		
		//Enter Origin - LAS
		
		
		//Enter Dest -  LAX
		
		
		//Select Date = Detp date
		driver.findElement(By.xpath("//span[text() = 'Depart']")).click();
		String a = "//html/body/div[2]/main/div[3]/div/div/div[2]/div[3]/article/div/section/div/section[1]/div/section/form/div[2]/fieldset/div[2]/fieldset/div[1]/div[1]/fieldset/section/div/div[1]/ol/div[";
		int i = 2;
		String b = "]/li";

		String xpCal = a + i + b; 
		
		String month = driver.findElement(By.xpath("//div[@class = 'calendar__month']")).getText();
		System.out.println("Month is - " + month);
		
		for(i = 2; i<=36; i++){
			xpCal = a + i + b;
			
			try{
				String dates = driver.findElement(By.xpath(xpCal)).getText();
				System.out.println(dates);
				
				if(dates.equals("15")){
					driver.findElement(By.xpath(xpCal)).click();
					System.out.println("Date is selected.");
					
					String selectedDate = driver.findElement(By.id("departCalendar_0")).getAttribute("value");
					System.out.println("Selected date is - " + selectedDate);
					
					String getTextVal = driver.findElement(By.id("departCalendar_0")).getText();
					System.out.println("getText() method val is - " + getTextVal);
					break;
				}
			}
			catch(Exception ex){
				System.out.println("No date for xPath - " + xpCal);
			}
		}
		
	}
	
	@After
	public void quitBrowser(){
		//driver.quit();
	}

}
