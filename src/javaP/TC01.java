package javaP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC01 {

	WebDriver driver;
	
	@Before
	public void launchBrowser(){
		driver=  new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Enter URL
		driver.get("http://www.naukri.com");
	}
	
	@Test
	public void testCase01() throws Exception{
		//TC Logic
		//Handle multiple browser windods
		Set<String> mySet = driver.getWindowHandles();
		System.out.println("Total open windows are : " + mySet.size());
		
		List<String> myL = new ArrayList<String>();
		Iterator<String> Itr = mySet.iterator();
		
		for(int i =0; i<mySet.size(); i++){
			myL.add(Itr.next());
		}
		
		//driver.switchTo().window(mySet.get)
		
		driver.switchTo().window(myL.get(3));
		System.out.println(driver.getTitle());
		driver.close();
		Thread.sleep(4000);
		
		driver.switchTo().window(myL.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		Thread.sleep(4000);
		
		driver.switchTo().window(myL.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		Thread.sleep(4000);
		
		driver.switchTo().window(myL.get(0));
		System.out.println(driver.getTitle());
		//driver.close();
		Thread.sleep(4000);
		
	}
	
	@After
	public void quitBrowser(){
		driver.quit();
	}
}
