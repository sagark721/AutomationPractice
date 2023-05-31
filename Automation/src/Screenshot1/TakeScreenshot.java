package Screenshot1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class TakeScreenshot {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws IOException {
		
	
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");
		
		TakesScreenshot ss=(TakesScreenshot) driver;
		
		 File src = ss.getScreenshotAs(OutputType.FILE);
		 File dest=new File("./data/Screenshots/ss1.png");
		 FileUtils.copyFile(src, dest);
		 
		
		
		
	}
	
}
