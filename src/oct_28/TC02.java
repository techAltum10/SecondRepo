package oct_28;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC02 extends LCB{

	@Test
	public void handleSuggestionList() throws Exception{
		
		driver.get("http://www.google.com");
		
		//Type some string to search
		WebElement googleTextBox = driver.findElement(By.id("lst-ib"));
		googleTextBox.sendKeys("Java");
		
		//driver.findElement(By.id("lst-ib")).sendKeys("Java");
		Thread.sleep(2000);
		
		String a = "//html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div/ul/li[";
		int i  = 1;
		String b = "]/div/div[2]";

		String xp = a + i + b;
		
		while(driver.findElement(By.xpath(xp)).isDisplayed()){
			xp = a + i + b;
			
			String text = driver.findElement(By.xpath(xp)).getText();
			System.out.println(text);
			
			if(text.equalsIgnoreCase("javatpoint")){
				driver.findElement(By.xpath(xp)).click();
				break;
			}
			i++;
		}
	}
}









