/*
 * WAP to navigate to google and type 'qsipers' in search text box, capture all the 
 * autosuggestions and print it on the console and select the last autosuggestion in it.
 */

package Revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2QspidersAutosugg {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("qspiders");
		Thread.sleep(2000);
		List<WebElement> suggs = driver.findElements(By.xpath("//li[@jsaction='click:.CLIENT;mouseover:.CLIENT']//div[1]//div[2]//div[1]//div[1]"));
		
		
	
		for(int i=0;i<suggs.size();i++) {
			System.out.println(suggs.get(i).getText());
			if(i==suggs.size()-1) {
				suggs.get(i).click();
			}
			
		}
		

	}

}
