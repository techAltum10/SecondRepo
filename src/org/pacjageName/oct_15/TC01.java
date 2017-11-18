package org.pacjageName.oct_15;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC01 {
	WebDriver driver;
	
	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
	}
	
	@Test
	public void selectValueFromDropDown(){
		//Select Day
		new Select(driver.findElement(By.id("day"))).selectByIndex(5);  //should select 5
		
		//Select Month
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select selectValueFromDropDown = new Select(monthDropDown);
		selectValueFromDropDown.selectByValue("5");   //should select May
		
		//Select Year
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1995");  //should select 1995
	}
	
	@After
	public void quitBrowser(){
		//driver.quit();
	}
}
