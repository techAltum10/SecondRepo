package oct_15;

import org.testng.annotations.Test;

public class TC01 extends LaunchCloseBrowser{
	
	//@Test(enabled = false)
	@Test
	public void testCase01(){
		
		driver.get("http://www.google.com");
		
		String pageTitle = driver.getTitle();
		
		System.out.println(pageTitle);
	}
	
}
