package oct_28;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class TC01 extends LCB{

	@Test
	public void testCase01() throws Exception{
		
		/*driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();*/
		
		driver.get("http://www.indianrail.gov.in/train_Schedule.html");
		
		//Click on Get Schedule
		driver.findElement(By.name("getIt")).click();
		Thread.sleep(2000);
		
		//Handle JS Alert
		Alert alrt = driver.switchTo().alert();
		
		String alertText = alrt.getText();
		System.out.println(alertText);
		
		alrt.accept();   //OK
		
		//alrt.dismiss();   //cancel
	}
}
