package com.actitime.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CustomerModule extends BaseClass{
	
	@Test(groups= {"forProject"})
	public void createCustomer() throws InterruptedException {
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		
		
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(p.getProperty("name"));
		
		
		
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(p.getProperty("name"));
		
		driver.findElement(By.xpath("(//div[text()='- Select Customer -'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='inputPlaceholder'])[16]/input")).sendKeys(p.getProperty("name"));
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='itemRow cpItemRow ']"));
		
		for(WebElement option:options) {
			if(option.getText().equals(p.getProperty("name"))) {
				option.click();
			}
		
		}
		
		
		
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		
//		WebDriverWait wait=new WebDriverWait(driver, 15);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='nameDuplicateError inlineErrorMessage leftInlineErrorMessage']")));
		
	/*	Thread.sleep(3000);
		if(driver.findElement(By.xpath("//div[@class='nameDuplicateError inlineErrorMessage leftInlineErrorMessage']")).isDisplayed())
		{
			String msg = driver.findElement(By.xpath("//div[@class='nameDuplicateError inlineErrorMessage leftInlineErrorMessage']")).getText();
			System.out.println(msg);
			Reporter.log("Duplicate Name");
			Assert.assertNotEquals(msg, msg);
			
		}
	*/	
		driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...'])[1]")).sendKeys(p.getProperty("name"));
		
		driver.findElement(By.xpath("//span[text()='"+p.getProperty("name")+"']")).click();
		String aname = driver.findElement(By.xpath("//div[@title='"+p.getProperty("name")+"']")).getText();
		
		Assert.assertEquals(aname, p.getProperty("name"));
		
	}

}
