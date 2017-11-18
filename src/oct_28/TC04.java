package oct_28;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class TC04 extends LCB{

	@Test
	public void testCase01() throws Exception{
		
		/*driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();*/
		
		driver.get("http://www.naukri.com");
		Thread.sleep(2000);

		((JavascriptExecutor)driver).executeScript("scroll(0, 500);");
		
	}
}
