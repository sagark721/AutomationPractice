package Scrolling;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling1 {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		int y = driver.findElement(By.xpath("(//a[@rev='regional-news|headline'])[1]")).getLocation().getY();
		
		System.out.println(y);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,"+y+")");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0,0)");
		                
		
	}
}
