package action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;
import locator.AddBookCartLocator;

public class AddBookCartAction extends BaseTest{


		AddBookCartLocator carts = new AddBookCartLocator();
		
		public void AddBook(Integer input1) throws IOException {

			driver.findElement(By.xpath(carts.Books)).click();
			driver.findElement(By.xpath(carts.active)).click();
			driver.findElement(By.xpath(carts.orderby)).click();
			WebElement dropdownOption =driver.findElement(By.xpath(carts.orderby1));  //locate dropdown element
			Select dropdown =new Select(dropdownOption);   //select Object 
			dropdown.selectByVisibleText("Name: A to Zdf");   //select by visible text
			driver.findElement(By.xpath(carts.title)).click();
			driver.findElement(By.xpath(carts.input)).clear();
		 	driver.findElement(By.xpath(carts.input1)).sendKeys(input1.toString());
			driver.findElement(By.xpath(carts.cartbutton)).click();
			
			//Take  Screenshot
			File screenshotFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile2, new File("screenshots\\screenshotBook.jpg"));
						
						

		}
	}

