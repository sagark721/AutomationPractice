package Revision;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElements;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class htmlProblem {

	
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args){
			WebDriver driver=new ChromeDriver();
			driver.get("C:/Users/pkana/Desktop/html1.html");
			
			List<WebElement> elms = driver.findElements(By.xpath("//a"));
			ArrayList<String> links=new ArrayList<>();
			for(WebElement ele:elms) {

				String l1 = ele.getAttribute("href");
				links.add(l1);
				
				
			}
			
			for(String link:links) {
				driver.navigate().to(link);
				driver.navigate().back();
			}
			

	}

}
