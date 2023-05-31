package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VtigerCustomerLogin {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		
		WebElement resource = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		Actions a=new Actions(driver);
		a.moveToElement(resource).perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Customers')])[1]")).click();
		
		WebElement loginbutton = driver.findElement(By.id("loginspan"));
		a.doubleClick(loginbutton).perform();
		
		
		String expTitle="Login - Vtiger";
		String actTitle=driver.getTitle();
		
		if(expTitle.equals(actTitle)) {
			System.out.println("Test is Passed.");
			System.out.println("Expected Title is: "+expTitle);
			System.out.println("Actual Title is: "+actTitle);
			
		}
		else {
			System.out.println("Test is Failed");
			System.out.println("Expected Title is: "+expTitle);
			System.out.println("Actual Title is: "+actTitle);
		}
		
		
		
		
	}

}
