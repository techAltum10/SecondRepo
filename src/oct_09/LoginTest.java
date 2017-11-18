package oct_09;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
	WebDriver driver;
	
	@Before
	public void launchBrowser(){
		//Open Browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Enter URL
		driver.get("http://www.flipkart.com");
	}
	@Test
	public void testLogin() throws Exception{
		
		//Check if user is on correct page or not
		String expectedPageTitle = "Flipkart"; 
		
		String actualPageTitle = driver.getTitle();
		
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		
		//Click on Login
		driver.findElement(By.xpath("//descendant::a[@class = '_2k0gmP'][8]")).click();
		System.out.println("Click on Login");
		
		//Enter Mob Num.
		driver.findElement(By.xpath("//input[@class = '_2zrpKA']")).sendKeys("9711235995");
		System.out.println("Enter mob num.");
		
		//Enter Passwd
		driver.findElement(By.xpath("//input[@class = '_2zrpKA _3v41xv']")).sendKeys("abc@123");
		System.out.println("Enter Passwd");
		
		//Click on Login
		driver.findElement(By.xpath("//button[@class = '_2AkmmA _1LctnI _7UHT_c']")).click();
		System.out.println("Click on Login button.");
		
		Thread.sleep(2000);
		
		//Verify if login is pass or fail
		//Is Login button displayed..?
		//boolean loginButton = driver.findElement(By.xpath("//button[@class = '_2AkmmA _1LctnI _7UHT_c']")).isDisplayed();
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@class = '_2AkmmA _1LctnI _7UHT_c']"));
		
		/*if(loginButton.isDisplayed()){
			System.out.println("Login is failed");
		}
		else{
			System.out.println("Login is passed");
		}*/
		
		Assert.assertTrue(loginButton.isDisplayed());
	}
	
	@After
	public void quitBrowser(){
		//driver.quit();
	}

}
