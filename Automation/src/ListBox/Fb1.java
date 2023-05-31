package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fb1 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
		driver.findElement(By.name("firstname")).sendKeys("Sagar");
		driver.findElement(By.name("lastname")).sendKeys("Kanade");
		driver.findElement(By.name("reg_email__")).sendKeys("sagar@kanade.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sagar@kanade.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Hello@Password123");
		WebElement day = driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByValue("22");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1= new Select(month);
		s1.selectByVisibleText("Feb");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByVisibleText("1993");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
		Thread.sleep(15000);
		driver.quit();
	}
}
