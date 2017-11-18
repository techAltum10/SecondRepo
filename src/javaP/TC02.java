package javaP;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC02 {

	WebDriver driver;
	
	@Before
	public void launchBrowser(){
		driver=  new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Enter URL
		driver.get("http://www.indianrail.gov.in/train_Schedule.html");
	}
	
	@Test
	public void testCase01() throws Exception{
		//TC Logic
		//Enter train number - 4682
		String exp_ArrTime = "07:11";
		System.out.println("Expected arrival time is - " + exp_ArrTime);
		driver.findElement(By.id("lccp_trnname")).sendKeys("4682");
		
		//Click on GetSchedule
		
		driver.findElement(By.name("getIt")).click();
		Thread.sleep(4000);
		
		WebElement table2 = driver.findElement(By.xpath("//descendant::table[@class = 'table_border_both'][2]"));
		
		List<WebElement> myL = table2.findElements(By.tagName("tr"));
		System.out.println("Total rows in table are - " + myL.size());
		
		String a = "//descendant::table[@class = 'table_border_both'][2]/tbody/tr[";
		int i = 2;
		String b = "]/td[3]";
		String c = "]/td[5]";
		String d = "]/td[6]";

		String xpTable = a + i + b;
		String xpArrTime = a + i + c;
		String xpDeptTime = a + i + d;
		
		for(i=2; i<=myL.size(); i++){
			xpTable = a + i + b;
			xpArrTime = a + i + c;
			xpDeptTime = a + i + d;
			
			String stationName = driver.findElement(By.xpath(xpTable)).getText();
			System.out.println(stationName);
			
			if(stationName.equalsIgnoreCase("AMBALA CITY")){
				System.out.println("station Found");
				
				//Get Arrival Time
				String arrTime = driver.findElement(By.xpath(xpArrTime)).getText();
				System.out.println("Actual arrival time is - " + arrTime);
				System.out.println("Arrival time at this ststion is - " + arrTime);
				
				//Dept time
				String deptTime = driver.findElement(By.xpath(xpDeptTime)).getText();
				System.out.println("Dept time at this ststion is - " + deptTime);
				
				if(exp_ArrTime.equals(arrTime)){
					System.out.println("Pass");
				}
				else{
					System.out.println("Fail");
				}
				
				break;
			}
		}
		
	}
	
	@After
	public void quitBrowser(){
		driver.quit();
	}
}
