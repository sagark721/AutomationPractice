package MouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 *  hovering
 *  double click
 *  right click
 *  drag and drop
 *  click
 */

public class Hovering {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Actions a=new Actions(driver);
		
		Thread.sleep(1000);
		
		WebElement men = driver.findElement(By.xpath("//div[text()='Fashion']"));		
		a.moveToElement(men).perform();
		
		Thread.sleep(1000);
		
		WebElement bwear = driver.findElement(By.xpath("//a[contains(text(),'Bottom Wear')]"));
		a.moveToElement(bwear).perform();
		
		Thread.sleep(1000);
		
		WebElement mensjeans = driver.findElement(By.xpath("(//a[contains(text(),'Jeans')])[1]"));
		a.moveToElement(mensjeans).perform();
		

		a.click(mensjeans).perform();
		
	}

}
