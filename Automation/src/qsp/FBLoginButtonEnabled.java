package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginButtonEnabled {
	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean button_status = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		
		if (button_status)
		{
			System.out.println("Login button on Facebook is Enabled");
		}
		else
			System.out.println("Login button on Facebook is disabled");
			
		
	}

}
