package org.pacjageName.oct_15;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC03 {
	WebDriver driver;
	
	@Before
	public void launchBrowser(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
	}
	
	@Test
	public void selectValueFromDropDown() throws Exception{
		
		//Check Female, Male radio button
		
		//-->Female
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value = '1']"));
		if(femaleRadioButton.isSelected()){
		
		//if(driver.findElement(By.id("u_0_3")).isSelected()){
			System.out.println("Female radio button is selected.");
		}
		else{
			System.out.println("Female radio button is notselected.");
		}
		
		//Male
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value = '2']"));
		
		if(maleRadioButton.isSelected()){
			System.out.println("Male radio button is selected.");
		}
		else{
			System.out.println("Male radio button is not selected.");
		}
		
		Thread.sleep(2000);
		
		//Click Male Radio
		//maleRadioButton = driver.findElement(By.id("u_0_4"));
		maleRadioButton.click();
		System.out.println("Click on Male radio button");
		
		//Check if Male radio is selectd
		if(maleRadioButton.isSelected()){
			System.out.println("Male radio button is selected.");
		}
		else{
			System.out.println("Male radio button is not selected.");
		}
		
	}
	
	@After
	public void quitBrowser(){
		//driver.quit();
	}
}
