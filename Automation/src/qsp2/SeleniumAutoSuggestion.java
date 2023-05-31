package qsp2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAutoSuggestion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
List<WebElement> sugg = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
int count=sugg.size();
System.out.println("The no elements present are:"+count);
for (int i = 0; i < count; i++) {
	System.out.println(sugg.get(i).getText());
}
sugg.get((count-1)).click();
driver.close();
	
}
	}
