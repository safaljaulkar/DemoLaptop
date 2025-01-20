package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		

		FileReader Fr = new FileReader(
				"C:\\Users\\mayur\\git\\Selenium-Test\\SeleniumD\\src\\main\\resources\\configfiles\\config.properties");
		
		
		
		Properties p = new Properties();    //object of properties class
		p.load(Fr);
		
		System.out.println(p.getProperty("browser"));  //use to print browser
		System.out.println(p.getProperty("testurl")); //use to print url
		
		
	}
	
	
}
