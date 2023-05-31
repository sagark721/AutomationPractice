package Revision;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrintTitlofMinistryOfCommerce {

	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://pib.gov.in/indexd.aspx");
		Thread.sleep(5000);
		System.out.println( driver.getTitle());

	}

}
