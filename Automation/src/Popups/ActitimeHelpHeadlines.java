package Popups;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeHelpHeadlines {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Read Service Agreement")));
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Read Service Agreement")).click();
		
		String pwh = driver.getWindowHandle();
		Set<String> tabs = driver.getWindowHandles();
		for(String p:tabs) {
			if(!(p.equals(pwh))) {
				driver.switchTo().window(p);
				List<WebElement> headlines = driver.findElements(By.xpath("//h2"));
				for(WebElement headline:headlines) {
					System.out.println(headline.getText());
				}
				
				driver.close();
				
			}
			
			
			
		}
		Thread.sleep(4000);
		driver.switchTo().window(pwh);
		driver.close();
		
		
		
		
		
		
	}

}
