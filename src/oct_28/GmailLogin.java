package oct_28;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
	
	WebDriver driver;
	
	@Before
	public void launchBrowser(){
		String filePath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", filePath + "//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//imp wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
	}
	
	@Test
	public void createNewEmailID() throws Exception{
		Thread.sleep(2000);
		//Click  to more options
		driver.findElement(By.xpath("//div[@jscontroller='cUYNmd']")).click();
		System.out.println("Click on More options");
		
		Thread.sleep(1000);
		//Click to Create an account
		WebElement createAccount = driver.findElement(By.xpath("//content[@class='z80M1 FwR7Pc']"));
		createAccount.click();
		System.out.println("Click on Create an account");
		
		Thread.sleep(2000);
		
		//Click to First Name Box
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.click();
		System.out.println("Click on First Name");
		
		//Enter first name
		firstName.sendKeys("TestFirst");
		System.out.println("Enter First Name");
		firstName.sendKeys(Keys.TAB);
		
		//Enter Last name
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("TestLast");
		System.out.println("Click on Last Name");
		lastName.sendKeys(Keys.TAB);
		
		//Enter gmail address
		WebElement gmailAddress = driver.findElement(By.id("GmailAddress"));
		gmailAddress.sendKeys("testingselenium1017");
		System.out.println("Enter Gmail Address");
		gmailAddress.sendKeys(Keys.TAB);
		
		//Enter Password
		WebElement addPassword = driver.findElement(By.id("Passwd"));
		addPassword.sendKeys("selenium@123");
		System.out.println("Enter Password");
		addPassword.sendKeys(Keys.TAB);
		
		//Confirm Password
		WebElement confirmPassword = driver.findElement(By.id("PasswdAgain"));
		confirmPassword.sendKeys("selenium@123");
		System.out.println("Confirm Password");
		confirmPassword.sendKeys(Keys.TAB);
		
		//Enter Birthday
		driver.findElement(By.id("BirthMonth")).click();
		Thread.sleep(1000);
		driver.findElement(By.id(":8")).click();
		System.out.println("Enter Month");
		Thread.sleep(1000);
		driver.findElement(By.id("birthday-placeholder")).click();
		Thread.sleep(1000);
		
		WebElement birthDay = driver.findElement(By.id("BirthDay"));
		birthDay.sendKeys("01");
		System.out.println("Enter day");
		birthDay.sendKeys(Keys.TAB);
		
		WebElement birthYear = driver.findElement(By.id("BirthYear"));
		birthYear.sendKeys("1990");
		System.out.println("Enter Year");
		birthYear.sendKeys(Keys.TAB);
		
		//Enter Gender
		driver.findElement(By.id("Gender")).click();
		driver.findElement(By.id(":f")).click();
		System.out.println("Enter Gender as Male");
		Thread.sleep(1000);
		
		//Enter Phone number
		WebElement phoneNumber = driver.findElement(By.id("RecoveryPhoneNumber"));
		phoneNumber.click();
		phoneNumber.sendKeys("8447077786");
		System.out.println("Enter phone number");
		phoneNumber.sendKeys(Keys.TAB);
		
		//Enter Current Email Address
		driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("himanshusingh187@gmail.com");
		System.out.println("Enter current email address");
		
		//Submit Next Step button
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0, 500);");
		
		//Click on I Agree button
		//driver.findElement(By.id("iagreebutton")).click();
	}
	
	@After
	public void quitBrowser(){
		//quitBrowser();
	}

}
