//Open chrome browser same url print title save title in variable


package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[href='https://mail.google.com/mail/&ogbl']")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
