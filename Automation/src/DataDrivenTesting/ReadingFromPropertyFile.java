package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReadingFromPropertyFile {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	void test123() {
		System.out.println("Test");
	}

	public static void main(String[] args) throws IOException {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FileInputStream fis=new FileInputStream("./data/AutomationLoginDetails.property");
		Properties p=new Properties();
		p.load(fis);
		
		
		
		driver.get(p.getProperty("url"));
		driver.findElement(By.id("email")).sendKeys(p.getProperty("email"));
		driver.findElement(By.id("enterimg")).click();
		
		
		
		
	}

}
