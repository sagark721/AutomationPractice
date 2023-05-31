package qsp2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo7 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com");
	driver.manage().deleteAllCookies();
	Thread.sleep(10000);
	driver.quit();
	WebDriver driver1=new FirefoxDriver();
	driver1.manage().window().maximize();
	driver1.get("https://www.facebook.com");
	driver1.manage().deleteAllCookies();
	Thread.sleep(10000);
	driver1.quit();
}
}
