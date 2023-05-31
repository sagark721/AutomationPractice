package qsp2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSourceBilling {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();		
		
		driver.get("https://demo.opensourcebilling.org/en/portal/clients/sign_in");
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"ax");
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"av");
	}

}
