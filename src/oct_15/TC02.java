package oct_15;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC02 extends LaunchCloseBrowser{
	
	@Test
	public void testCase02(){
		driver.get("http://www.gmail.com");
		
		String pageTitle = driver.getTitle();
		
		//System.out.println(pageTitle);
		Reporter.log(pageTitle);
	}
	
}
