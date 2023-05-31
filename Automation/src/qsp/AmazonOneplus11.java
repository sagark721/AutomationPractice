package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonOneplus11 {

	
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.amazon.in/");
			//Thread.sleep(3000);
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus 11 pro"+Keys.ENTER);
			
			
	}

}
//(//span[contains(text(),'OnePlus 11')]) && 

//span[contains(text(),'OnePlus 11')]) & (//span[2]/span[contains(text(),'₹')])


//(//span[contains(text(),'OnePlus 11')]/../../../../div[3]/div[1]/div/div[1]/div[1]/a/span/span[1][contains(text(),'₹')])
		
		