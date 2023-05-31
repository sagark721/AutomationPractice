package qsp2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxActiTime {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	 boolean logo = driver.findElement(By.id("keepLoggedInCheckBox")).isDisplayed();
	 if (logo)
			System.out.println("CheckBox is Present & Pass ");
		else
			System.out.println("CheckBox is not Present & Fail");
			driver.close();

	}

}
