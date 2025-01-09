package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;
import locator.AddBookCartLocator;

public class AddBookCartAction extends BaseTest{


		AddBookCartLocator carts = new AddBookCartLocator();
		
		public void AddBook(Integer input1) {

			driver.findElement(By.xpath(carts.Books)).click();
			driver.findElement(By.xpath(carts.active)).click();
			driver.findElement(By.xpath(carts.orderby)).click();
			WebElement dropdownOption =driver.findElement(By.xpath(carts.orderby1));  //locate dropdown element
			Select dropdown =new Select(dropdownOption);   //select Object 
			dropdown.selectByVisibleText("Name: A to Z");   //select by visible text
			driver.findElement(By.xpath(carts.title)).click();
			driver.findElement(By.xpath(carts.input)).clear();
		 	driver.findElement(By.xpath(carts.input1)).sendKeys(input1.toString());
			driver.findElement(By.xpath(carts.cartbutton)).click();
			

		}
	}

