package qsp2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJobs {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("wipro jobs"+Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> allLink = driver.findElements(By.tagName("a"));
		int count = allLink.size();
		System.out.println("The Number of links present in webpage are:"+count);
		for (int i = 0; i < count; i++) {
			System.out.println(allLink.get(i).getAttribute("href"));}
		driver.close();
			
		}
				}
	


