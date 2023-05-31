// Closing the browser without Close()


package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[href='https://mail.google.com/mail/&ogbl']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("a[href='https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp']"));
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		
		
		

	}

}
