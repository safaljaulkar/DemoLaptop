package signinsignout;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BasePage;



public class Login extends BasePage{

	@Test
	public void VerifyLogin() {

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Jerry1489@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Jerry@1997");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

		String Act = driver.findElement(By.xpath("//a[@class='account']")).getText();
		String Exp = "Jerry1489@gmail.com";
		Assert.assertEquals(Exp, Act);

	
	}	
}
	

	
	