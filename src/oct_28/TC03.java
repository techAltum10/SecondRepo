package oct_28;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TC03  extends LCB{

	@Ignore
	@Test
	public void handleIFrame() throws Exception{
		driver.get("http://www.snapdeal.com");
		
		//Mouse Over - SignIn
		WebElement Login = driver.findElement(By.xpath("//div[@class = 'accountInner']"));
		Actions action = new Actions(driver);
		action.moveToElement(Login);
		action.build().perform();
		Thread.sleep(1000);
		System.out.println("Mouse over - Done");
		
		
		//Click on - Login
		driver.findElement(By.xpath("//a[text() = 'login']")).click();
		Thread.sleep(1000);
		System.out.println("Click on Login");
		
		WebElement loginFrame = driver.findElement(By.id("loginIframe"));
		driver.switchTo().frame(loginFrame);
		
		//Enter Mobile Number
		driver.findElement(By.id("userName")).sendKeys("9711235995");
		System.out.println("Enter mobile number");
		
	}
	//atyagi.mails@gmail.com
}
