package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionSelenium {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		WebElement searchbar = driver.findElement(By.name("q"));
		searchbar.clear();
		searchbar.sendKeys("Selenium");
		Thread.sleep(3000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		System.out.println("Count of AutoSuggestions: "+suggestions.size());
		System.out.println();
		System.out.println("List of Auto Suggestions: ");
		System.out.println();
		for(int i=0;i<suggestions.size();i++)
		{
			System.out.println(suggestions.get(i).getText());
		}
		
		suggestions.get(suggestions.size()-1).click();
		
		
	}

}
