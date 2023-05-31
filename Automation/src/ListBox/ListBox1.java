package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Qspiders/SELENIUM/Hotel.html");
		
		WebElement mtr = driver.findElement(By.id("mtr"));
		
		Select s=new Select(mtr);
		
		for(int i=0;i<s.getOptions().size();i++) {
			Thread.sleep(1000);
			s.selectByIndex(i);
		}
		Thread.sleep(3000);
		for(int i=s.getOptions().size()-1;i>=0;i--) {
			Thread.sleep(1000);
			s.deselectByIndex(i);
		}
		
	}

}
