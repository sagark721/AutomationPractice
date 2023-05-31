package Synchronizationss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTimeOut {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		try {
			driver.get("https://demo.actitime.com/login.do");
			System.out.println("Loaded within 10 Seconds");
			}
		catch(Exception e){
			System.out.println("Not Loaded in 10 Seconds");
		}
			Thread.sleep(7000);
			driver.close();
		
	}

}
