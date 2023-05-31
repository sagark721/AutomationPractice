package Revision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Write a program to navigate to cleartrip.com and then search for a flight 
 * available on 5th june 2023 from bangalore to goa, capture departure time and flight name 
 * and then display it on console.
 */
public class Assignment1 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//div[@class='d-flex']/div[2]/div[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//ul[@class='airportList'][1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("Goa");
		driver.findElement(By.xpath("//ul[@class='airportList'][1]")).click();
		
		driver.findElement(By.xpath("//div[@class='row  p-relative ']//button[1]")).click();
		
		
	}

}
