package Revision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTripPopupclose {

	

		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://www.cleartrip.com/");
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class='d-flex']//div[2]//div[1]//div[2])[2]")).click();
			
			driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("Bangalore");
			driver.findElement(By.xpath("(//ul//div[@class='flex flex-middle'])[1]")).click();
			
			driver.findElement(By.xpath("(//div[@class='flex flex-middle p-relative homeCalender']//button)[1]")).click();
			driver.findElement(By.xpath("(//div[text()='25'])[2]")).click();
	}

}
