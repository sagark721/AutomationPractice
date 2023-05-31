package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjectModule extends BaseClass{

	@Test (dependsOnGroups = "forProject")
	void createProject() throws InterruptedException {
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		
		//clicking on new project button
		driver.findElement(By.xpath("//div[@class='item createNewProject']")).click();
		
		//entering project name
		String pname = p.getProperty("project");
		driver.findElement(By.xpath("(//input[@placeholder='Enter Project Name'])[2]")).sendKeys(pname);
		
		driver.findElement(By.xpath("//div[text()='-- Please Select Customer to Add Project for  --']")).click();
		
		//adding customer
		String cname = p.getProperty("name");
		WebElement addingCustomer = driver.findElement(By.xpath("//div[text()='-- Please Select Customer to Add Project for  --']/../..//input"));
		addingCustomer.sendKeys(cname);
		//checking for exception

/*		 	if(driver.findElement(By.xpath("//div[@class='itemRow notFound']")).isDisplayed()) {
			
		
			Reporter.log("No Such Customer");
			Assert.fail();
		}
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[text()='-- Please Select Customer to Add Project for  --']/../..//input"), cname));
		String text = driver.findElement(By.xpath("(//div[@class='searchItemList'])/div")).getText();
		System.out.println(text);
		if(text.contains("No customers found")) {
			Reporter.log("No Such Customer");
			Assert.fail();
		}else {
			driver.findElement(By.xpath("(//div[@class='itemRow cpItemRow '])[1]//span")).click();	
		}
*/
		
		driver.findElement(By.xpath("(//div[@class='itemRow cpItemRow '])[1]//span")).click();
		
		//adding description
		String desc = p.getProperty("des");
		driver.findElement(By.xpath("//textarea[@placeholder='Add Project Description']")).sendKeys(desc);
		
		
		//adding task
		String task = p.getProperty("task");
		driver.findElement(By.xpath("(//input[@placeholder='Enter task name'])[1]")).sendKeys(task);
		
		
		//adding task desciption
		driver.findElement(By.xpath("(//a[@id='descriptionElement'])[1]")).click();
		
		driver.findElement(By.xpath("//textarea[@id='editDescriptionPopupText']")).sendKeys(desc);
		driver.findElement(By.xpath("//input[@id='scbutton']")).click();
		
		//adding deadline
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[1]")).click();
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//span[text()='21'])[2]")));
		driver.findElement(By.xpath("//span[text()='21']")).click();
		
		//adding type of work
		driver.findElement(By.xpath("(//div[@class='value ellipsis'])[23]")).click();
		driver.findElement(By.xpath("(//div[text()='testing'])[4]")).click(); 
		
		
		driver.findElement(By.xpath("//div[text()='Create Project']")).click();
		
		driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...'])[1]")).sendKeys(cname);
		driver.findElement(By.xpath("(//span[@class='highlightToken'])[1]")).click();
		String apname = driver.findElement(By.xpath("//div[@title='Project1']/../div[2]")).getText();
		Assert.assertEquals(pname,apname);
	
		
		
	}
}
