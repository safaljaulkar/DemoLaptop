package computer;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import signinsignout.Login;

public class Computers extends Login {

	@Test(priority = 1)
	public void VerifyDesktopAddToCart() {

		Computers dj = new Computers();
		dj.VerifyLogin();

		driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Computers']")).click();
		driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Desktops']")).click();

		WebElement DropdownSelect = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select drp = new Select(DropdownSelect);
		drp.selectByVisibleText("Name: A to Z");

		driver.findElement(By.xpath("//h2[@class='product-title']")).click();
		driver.findElement(By.xpath("//input[@id='product_attribute_72_5_18_52']")).click();
		driver.findElement(By.xpath("//input[@id='product_attribute_72_6_19_91']")).click();
		driver.findElement(By.xpath("//input[@id='product_attribute_72_3_20_57']")).click();
		driver.findElement(By.xpath("//input[@id='product_attribute_72_8_30_93']")).click();
		driver.findElement(By.xpath("//input[@id='addtocart_72_EnteredQuantity']")).clear();
		driver.findElement(By.xpath("//input[@id='addtocart_72_EnteredQuantity']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();

		String Act = driver.findElement(By.xpath("//p[@class='content']")).getText();
		String Exp = "The product has been added to your + shopping cart";
		Assert.assertEquals(Act, Exp);

	}

	@Test(priority = 2)

	public void VerifyNotebookAddToCart() {

		Computers dj = new Computers();
		dj.VerifyLogin();

		driver.findElement(By.xpath("//li[@class='inactive']//a[normalize-space()='Notebooks']")).click();

		WebElement SortBy = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select SB = new Select(SortBy);
		SB.selectByVisibleText("Name: A to Z");

		WebElement Display = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select ds = new Select(Display);
		ds.selectByVisibleText("4");

		driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();

		String Act = driver.findElement(By.xpath("//p[@class='content']")).getText();
		String Exp = "The product has been added to your + shopping cart";
		Assert.assertEquals(Act, Exp);
		
	}

	@Test(priority = 3)

	public void VerifyAccessoriesAddToCart() {

		Computers dj = new Computers();
		dj.VerifyLogin();

		driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Accessories']")).click();

		WebElement SortBy1 = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select SB1 = new Select(SortBy1);
		SB1.selectByVisibleText("Name: A to Z");

		WebElement Display1 = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select ds1 = new Select(Display1);
		ds1.selectByVisibleText("4");

		
		driver.findElement(By.xpath("//h2[@class='product-title']")).click();
		driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();

	

	}
}
