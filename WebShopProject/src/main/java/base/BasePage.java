package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage{

	public static WebDriver driver; // driver reference

	public static Properties prop = new Properties();
	public static FileReader fr1;

	@BeforeTest // annoted method run before test
	public void setup() throws IOException {


		if (driver == null) {
			FileReader fr1 = new FileReader("C:\\Users\\mayur\\git\\Selenium-Test\\SeleniumD\\src\\main\\resources\\configfiles\\config.properties");
			prop.load(fr1); // load the properties reader, object
		}

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup(); // base
			driver = new ChromeDriver(); // base
			driver.get(prop.getProperty("testurl")); // properties

		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup(); // base
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("testurl"));

		}

	}

	@AfterTest
	public void teardown() { // use to close
		// driver.close();
		System.out.println("Done");

	}

}
