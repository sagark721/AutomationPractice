package Listenersss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(Listenersss.ListenerImplementation.class)
public class GoogleScreenshot extends BaseClass {

//	static {
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//	}
	
	@Test
	public void screenshot() {

//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		Assert.fail();
	}
}
