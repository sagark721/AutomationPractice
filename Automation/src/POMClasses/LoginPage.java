package POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	/*
	 * driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	 */
	
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwdbx;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement lgBtn;
	
	
	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	
	public void setLogin(String un, String pwd) {
		
		untbx.sendKeys(un);
		pwdbx.sendKeys(pwd);
		lgBtn.click();
	}
}
