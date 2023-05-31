package qsp2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWidthActitime {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement login = driver.findElement(By.name("username"));
		int h1 = login.getSize().getHeight();
		int w1 = login.getSize().getWidth();
		WebElement pwd = driver.findElement(By.name("pwd"));
		int h2 = pwd.getSize().getHeight();
		int w2 = pwd.getSize().getWidth();

		if(h1==h2 && w1==w2)
			System.out.println("Username & Password Textfield Height & Width are same & pass");
		else
			System.out.println("Username & Password Textfield Height & Width are not same & fail");
	}

}
