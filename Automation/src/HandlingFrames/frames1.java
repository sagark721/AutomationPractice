package HandlingFrames;

import javax.servlet.annotation.WebFilter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames1 {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.get("file:///C:/Users/pkana/Desktop/tt1.html");
		driver.findElement(By.id("t1")).sendKeys("Hello");
		
		WebElement embframe = driver.findElement(By.id("f1"));
		driver.switchTo().frame(embframe);
		driver.findElement(By.id("t2")).sendKeys("Bye");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).clear();
		driver.findElement(By.id("t1")).sendKeys("Akash");
	}

}
