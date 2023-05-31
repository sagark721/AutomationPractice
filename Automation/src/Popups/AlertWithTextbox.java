package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertWithTextbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[text()='Alert with Textbox ']")));
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Thread.sleep(3000);
		
	
		Robot r =new Robot();
		/*r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		*/
		
		//r.keyPress(KeyEvent.VK_BACK_SPACE);
		//r.keyRelease(KeyEvent.VK_BACK_SPACE);
		//r.keyPress(KeyEvent.VK_SHIFT);
		
		//r.keyPress(KeyEvent.VK_S);
		//r.keyRelease(KeyEvent.VK_S);
		/*r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_G);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_R);
		
		r.keyRelease(KeyEvent.VK_SHIFT);
		*/
		r.keyPress(KeyEvent.VK_R);
		//driver.switchTo().alert().sendKeys("Sagar");
		//driver.switchTo().alert().accept();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String text = driver.findElement(By.id("demo1")).getText();
		System.out.println(text);
		
		
		
		Thread.sleep(7000);
		driver.close();
}
}
