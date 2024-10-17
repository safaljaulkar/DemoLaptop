package book;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RemoveFromCart extends EmailFriend{

	
	@Test
	
	public void Remove() throws InterruptedException {
		
		RemoveFromCart RFC =new RemoveFromCart();     //used multilevel inheritance
		
	    RFC.VerifySentEmail();

		driver.findElement(By.xpath("(//a[@class='ico-cart'])[1]")).click();
		driver.findElement(By.xpath("//input[@value='4627359']")).click();
		driver.findElement(By.xpath("//input[@class='button-2 update-cart-button']")).click();
		
	}
}
