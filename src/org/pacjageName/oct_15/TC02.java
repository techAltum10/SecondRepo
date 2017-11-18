package org.pacjageName.oct_15;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.Select;

public class TC02 {
	WebDriver driver;
	
	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.naukri.com");
	}
	
	@Test
	public void selectValueFromDropDown(){
		//Click on Search Box
		driver.findElement(By.id("qsbClick")).click();
		//Enter Skills
		driver.findElement(By.name("qp")).sendKeys("Java");
		//Enter Location
		driver.findElement(By.name("ql")).sendKeys("Noida");
		
		//Press Tab Key
		driver.findElement(By.name("ql")).sendKeys(Keys.TAB);
		
		//Arrow Down - Exp
		
		for(int i = 1; i<=5; i++){
			driver.findElement(By.xpath("//input[@class = 'sdTxt w85']")).sendKeys(Keys.ARROW_DOWN);
		}
		
		//Enter Experience
		//new Select(driver.findElement(By.xpath("//input[@class = 'sdTxt w85']"))).selectByIndex(5); //should select 4
		
		
		
	}
	
	@After
	public void quitBrowser(){
		//driver.quit();
	}
}
