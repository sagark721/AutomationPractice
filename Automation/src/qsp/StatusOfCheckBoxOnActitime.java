package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfCheckBoxOnActitime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean checkbox_status = driver.findElement(By.xpath("//input[@name='remember']")).isSelected();
		
		if (checkbox_status)
		{
			System.out.println("CheckBox is Selected");
		}
		else
			System.out.println("CheckBox is not Selected");
	}

}
