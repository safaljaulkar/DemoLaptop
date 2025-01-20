package logintest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import action.AddBookCartAction;
import action.AddComputerCartAction;
import action.LoginAction;
import base.BaseTest;

public class Login extends BaseTest {

	LoginAction action = new LoginAction(); // instance for action
	AddBookCartAction cart = new AddBookCartAction();
	AddComputerCartAction cart1 = new AddComputerCartAction();
	
	
	
	@Test(priority = 2)
	public void VerifyLogin() throws IOException {

		action.login(userName, password);
		System.out.println("1");
	  
	}

	@Test(priority = 3)
	public void VerifyAddBookCart() throws IOException {

	
		Integer value = 3;
		cart.AddBook(value);
		System.out.println("2");
	
	}

	@Test(priority = 4)
	public void VerifyComputerCart() throws IOException {

		Integer value1 = 3;
		cart1.VerifyComputer(value1);
		System.out.println("3");
		
	}

	@Test(priority = 5)
	public void VerifyLogout() {

		action.logout();
		System.out.println("4");

	}

}
