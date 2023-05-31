package Revision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class calenderPopupTest {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		
		driver.findElement(By.xpath("//div[@class='item createNewProject']")).click();
		
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[1]")).click();
	//	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//span[text()='21'])[2]")));
		driver.findElement(By.xpath("//span[text()='21']")).click();
		
	}

}
