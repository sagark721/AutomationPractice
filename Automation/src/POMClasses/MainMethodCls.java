package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainMethodCls {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		LoginPage l=new LoginPage(driver);
		driver.get("https://demo.actitime.com/login.do");
		l.setLogin("admin", "manager");
	}
}
