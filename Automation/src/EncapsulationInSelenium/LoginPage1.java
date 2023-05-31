package EncapsulationInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 {

	private WebElement untbx;
	
	LoginPage1(WebDriver driver){
		untbx=driver.findElement(By.id("username"));
	}
	
	public void setUser(String un) {
		untbx.sendKeys("admin");
	}
}
