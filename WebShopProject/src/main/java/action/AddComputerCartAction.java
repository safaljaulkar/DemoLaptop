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
import locator.AddComputerCartLocator;

public class AddComputerCartAction extends BaseTest {
	
	
	AddComputerCartLocator computer = new 	AddComputerCartLocator();
	
	
	public void VerifyComputer(Integer input2) throws IOException {
		
		driver.findElement(By.xpath(computer.Computer)).click();
		driver.findElement(By.xpath(computer.Desktops)).click();

		WebElement DropdownSelect = driver.findElement(By.xpath(computer.OrderBy));
		Select drp = new Select(DropdownSelect);
		drp.selectByVisibleText("Name: A to Z");

		driver.findElement(By.xpath(computer.ProductTitle)).click();
		driver.findElement(By.xpath(computer.attribute1)).click();
		driver.findElement(By.xpath(computer.attribute2)).click();
		driver.findElement(By.xpath(computer.attribute3)).click();
		driver.findElement(By.xpath(computer.attribute4)).click();
		driver.findElement(By.xpath(computer.EnterQuantity )).clear();
		driver.findElement(By.xpath(computer.EnterQuantity1 )).sendKeys(input2.toString());
		driver.findElement(By.xpath(computer.AddCart)).click();
		
		//Take  Screenshot
		File screenshotFile3= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile3, new File("screenshots\\screenshotComputer.jpg"));
					
				
		
	}
	
}
