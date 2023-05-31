package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneData {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		WebElement searchbar = driver.findElement(By.name("q"));
		searchbar.sendKeys("Iphone 14 Pro Max"+Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		List<WebElement> iphones = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]"));
		List<WebElement> prices = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]/../../div[2]/div[1]/div[1]/div[1]"));
		
		for(int i=0;i<iphones.size();i++)
		{
			System.out.println(iphones.get(i).getText()+"--------------> "+prices.get(i).getText());
		}
	}

}
