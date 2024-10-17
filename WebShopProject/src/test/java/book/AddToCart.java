package book;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import signinsignout.Login;

public class AddToCart extends Login {

	@Test
	public void VerifyBookPurchase() throws InterruptedException {

		AddToCart obj = new AddToCart();
		obj.VerifyLogin();

		driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Books']")).click();
		driver.findElement(By.xpath("//select[@id='products-orderby']")).click();

		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='products-orderby']")));

		dropdown.selectByVisibleText("Name: A to Z");
		
		driver.findElement(By.xpath("(//h2[@class ='product-title'])[3]")).click();
		driver.findElement(By.xpath("//input[@class='qty-input']")).clear();
	 	driver.findElement(By.xpath("//input[@class='qty-input']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-45']")).click();
	
//		String Act = driver.findElement(By.xpath("//p[@class='content']")).getText();
//		String Exp = "The product has been added to your + shopping cart";
//
//		Assert.assertEquals(Act, Exp);

	}
}
