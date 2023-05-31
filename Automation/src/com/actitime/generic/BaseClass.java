package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public Properties p;
	public static WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeClass
	public  void openBrowse() {
		Reporter.log("Opening Browser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver, 20);
	}
	
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("Login",true);
		FileInputStream fis=new FileInputStream("./data/actitimedata1.property");
		 p= new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String un = p.getProperty("un");
		String pwd = p.getProperty("pwd");
		driver.get(url);
		
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	}
/*	
	@AfterMethod
	public void logout()  {
		Reporter.log("Logout",true);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Closing Browser",true);
		driver.close();
	}
	*/
	


}
