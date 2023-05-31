package Revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple 14 Pro Max");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement link : links) {
			System.out.println(link.getAttribute("href"));
		}
		
		

	}

}

//flipkart > narzo50 > collect all mobile name and prices of that page
