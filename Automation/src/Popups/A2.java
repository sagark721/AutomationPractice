package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A2 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')] ")));
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')] ")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()'] ")).click();
		
		driver.switchTo().alert().dismiss();
		String text = driver.findElement(By.id("demo")).getText();
		
		System.out.println("Text displayed on Desktop: "+text);
		Thread.sleep(7000);
		driver.close();
	}

}
