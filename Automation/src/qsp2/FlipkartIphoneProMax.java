package qsp2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphoneProMax {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("APPLE iPhone 14 Pro Max"+Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> desc = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro')]"));
		List<WebElement> amt = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro')]/../../../../a/div/div/div[1]/div[1]/div[1]"));
		int countdesc = desc.size();
		int countamt = amt.size();
		System.out.println(countdesc);
		System.out.println(countamt);
		for (int i = 0; i <amt.size(); i++) {
			String pname = desc.get(i).getText();
			String price = amt.get(i).getText();
			System.out.println(pname+"----->"+price);
		}
		driver.quit();
			
		}
	}

