package userregister;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BasePage;

public class RegisterUser extends BasePage {

	@Test
	public void VerifyRegister() {

		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Tom");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Jerry");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Tom1998@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Tom@1234");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Tom@1234");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();

		String Act = driver.findElement(By.xpath("//div[@class='result']")).getText();
		String Exp = "Your registration completed";
		Assert.assertEquals(Act, Exp);

	}
}

