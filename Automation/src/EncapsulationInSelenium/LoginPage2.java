package EncapsulationInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage2 {

	private WebElement untbx;
	private WebElement pwdbx;
	private WebElement lgnbtn;
	public LoginPage2(WebDriver driver) {

		untbx = driver.findElement(By.id("username"));
		pwdbx = driver.findElement(By.name("pwd"));
		lgnbtn = driver.findElement(By.xpath("//div[text()='Login ']"));
	}
	
	public void setElements(String un, String pwd) {
		untbx.sendKeys(un);
		pwdbx.sendKeys(pwd);
		lgnbtn.click();
		
	}
	
	
	
}
