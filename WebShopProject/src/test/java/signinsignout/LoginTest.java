package signinsignout;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BasePage;


public class LoginTest extends BasePage{
	@Test(priority = 1)

	public static void VerifyLoginWithCorrectCredential() {

		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Jerry1489@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Jerry@1997");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

		String Act = driver.findElement(By.xpath("//a[@class='account']")).getText();
		String Exp = "Jerry1489@gmail.com";
		Assert.assertEquals(Exp, Act);

	}

	@Test(priority = 2)
	public static void VerifyLoginWithIncorrectUsername() {
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Jerr@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Jerry@1997");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

		String Act = driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful. Please correct the errors ')]")).getText();
		String Exp = "Login was unsuccessful. Please correct the errors and try again.";
	    Assert.assertEquals(Exp, Act);
	
	}

	@Test(priority = 3)
	public static void VerifyLoginWithIncorrectPassword() {
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Jerry1489@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Jerry@");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

		String Act = driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful. Please correct the errors ')]")).getText();
		String Exp = "Login was unsuccessful. Please correct the errors and try again.";
	    Assert.assertEquals(Exp, Act);
	
	}	
	
}
