package qsp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo2 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		

		driver.get("https://www.linkedin.com/");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().to("https://www.gmail.com/");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.close();
	}

}
