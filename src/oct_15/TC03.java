package oct_15;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC03 extends LaunchCloseBrowser{
	
	@Test
	public void testCase03(){
		driver.get("http://www.cricinfo.com");
		
		String pageTitle = driver.getTitle();
		
		//System.out.println(pageTitle);
		Reporter.log(pageTitle);
	}
}
