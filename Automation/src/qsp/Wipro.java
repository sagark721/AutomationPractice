package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wipro {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Wipro Jobs"+Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		Thread.sleep(3000);
		for(int i=0;i<links.size();i++) {
			System.out.println( links.get(i).getAttribute("href"));
		}
		System.out.println("No. of Links Found: "+links.size());
	}

}
