package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClassA {
	public static void testA(WebDriver driver) throws InterruptedException
	{
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.navigate().to("https://www.linkedin.com");
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.navigate().to("https://www.gmail.com");
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.findElement(By.className("c1")).click();
		
		
		driver.close();
		
		
		
		
	}

}
