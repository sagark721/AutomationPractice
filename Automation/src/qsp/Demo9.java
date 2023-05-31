

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		driver.navigate().refresh();
		driver.navigate().back();
		//driver.findElement(By.tagName(s="s1"));
		//driver.findElement(By.className(cs="s1"));
		//driver.findElement(By.id(d="s1"));
		driver.manage().deleteAllCookies();
		driver.quit();
		

	}

}
