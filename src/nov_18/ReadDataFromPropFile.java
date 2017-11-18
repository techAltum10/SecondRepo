package nov_18;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromPropFile {

	@Test
	public void readDataFrmPropFile() throws Exception{
		
		String filePath = System.getProperty("user.dir") + "\\Resource\\data.properties";
		File file = new File(filePath);
		FileInputStream fIP = new FileInputStream(file);
		
		Properties prop = new Properties();
		prop.load(fIP);
		
		//Read Data
		String name = prop.getProperty("name");
		System.out.println("Name is - " + name);
		
		String adds = prop.getProperty("adds");
		System.out.println("Address is - " + adds);
	}
}
