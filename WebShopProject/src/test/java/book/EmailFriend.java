package book;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmailFriend extends AddToCart{

	
	
	@Test
	public void VerifySentEmail () throws InterruptedException {
		
		EmailFriend Ef =new EmailFriend();
		Ef.VerifyBookPurchase();
		
		driver.findElement(By.xpath("//input[@class='button-2 email-a-friend-button']")).click();
		driver.findElement(By.xpath("//input[@id='FriendEmail']")).sendKeys("jaulkarsafal28@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='PersonalMessage']")).sendKeys("Hii please buy this book");
		driver.findElement(By.xpath("//input[@class='button-1 send-email-a-friend-button']")).click();
		
		
		String Act = driver.findElement(By.xpath("//div[@class='result']")).getText();
		String Exp =   "Your message has been sent.";
		
		Assert.assertEquals(Act, Exp);

		
		
		
		
	}
}
