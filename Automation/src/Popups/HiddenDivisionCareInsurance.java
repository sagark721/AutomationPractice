package Popups;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDivisionCareInsurance {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care/");
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("policynumber")));
		
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		
		
		WebElement month = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select s=new Select(month);
		s.selectByIndex(1);
		
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select year1=new Select(year);
		year1.selectByValue("1993");
		
		driver.findElement(By.xpath("//a[text()='22']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		
		String expError="Please enter valid Policy No.";
		String actError = driver.findElement(By.id("policynumberError")).getText();
		
		if(expError.equals(actError)) {
			System.out.println("Test is Passed");
		}
		else {
			System.out.println("Test is Failed");
		}
		
		System.out.println(actError);
		
		
		Thread.sleep(10000);
		driver.close();
		
		
		
	}

}
