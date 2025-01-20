package action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import base.BaseTest;
import locator.AddBookCartLocator;
import locator.LoginLocator;

public class LoginAction extends BaseTest{

	ExtentReports extent;
		LoginLocator locator = new LoginLocator();
		AddBookCartLocator carts = new AddBookCartLocator();

		public void login(String UserName, String Password) throws IOException {

			ExtentTest logintest = extent.createTest("VerifyLoginTest");
			
			driver.manage().window().maximize();
			driver.findElement(By.xpath(locator.loginbutton)).click();
			driver.findElement(By.xpath(locator.username)).sendKeys(UserName);
			driver.findElement(By.xpath(locator.password)).sendKeys(Password);
			driver.findElement(By.xpath(locator.RememberMe)).click();
			driver.findElement(By.xpath(locator.LoginButton)).click();
			 logintest.info("UserLogin");
			
			//Take  Screenshot
			File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile1, new File("screenshots\\screenshotlogin.jpg"));
						
					
			//compairing actual result vs expected result
			Assert.assertEquals(driver.findElement(By.xpath("//div[@class='header-logo']")).getText(), "Tricentis Demo Web Shop");
			
			
			
		}
		
		public void logout() {
			driver.findElement(By.xpath(locator.LogoutButton)).click();

		}

	}
	
	

