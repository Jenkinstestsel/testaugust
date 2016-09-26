package genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.ui.WebDriverWait;

public class utility {
	
	
//	read from properties file
	
	public static String getpropertyval(String key) throws Exception{
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\Config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.get(key).toString();
		
		
		
		
		
	}
	
	
	
	

}
