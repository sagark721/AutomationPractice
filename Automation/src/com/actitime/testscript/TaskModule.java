package com.actitime.testscript;

import org.openqa.selenium.By;

import com.actitime.generic.BaseClass;

public class TaskModule extends BaseClass {
	
	public void createTask() {
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
	}

}
