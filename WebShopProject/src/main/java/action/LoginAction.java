package action;

import org.openqa.selenium.By;

import base.BaseTest;
import locator.AddBookCartLocator;
import locator.LoginLocator;

public class LoginAction extends BaseTest{

	
		LoginLocator locator = new LoginLocator();
		AddBookCartLocator carts = new AddBookCartLocator();

		public void login(String UserName, String Password) {

			driver.manage().window().maximize();
			driver.findElement(By.xpath(locator.loginbutton)).click();
			driver.findElement(By.xpath(locator.username)).sendKeys(UserName);
			driver.findElement(By.xpath(locator.password)).sendKeys(Password);
			driver.findElement(By.xpath(locator.RememberMe)).click();
			driver.findElement(By.xpath(locator.LoginButton)).click();

		}
		
		public void logout() {
			driver.findElement(By.xpath(locator.LogoutButton)).click();

		}

	}
	
	

