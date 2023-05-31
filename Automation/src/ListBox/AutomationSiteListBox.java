package ListBox;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationSiteListBox {


	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Index.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("email"));
		driver.findElement(By.id("enterimg")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Sagar");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kanade");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Pune, Mahrashtra.");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("sagar@kanade.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("95959595");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		
		/*
		WebElement language = driver.findElement(By.id("msdd"));
		Select s6=new Select(language);
		s6.selectByVisibleText(null)
		*/
		
		driver.findElement(By.id("msdd")).click();
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='English']")).click();
		driver.findElement(By.xpath("//a[text()='Hindi']")).click();
		
		WebElement skills = driver.findElement(By.xpath("//select[@ng-model='Skill']"));
		Select s1=new Select(skills);
		s1.selectByVisibleText("Java");
		
		WebElement country = driver.findElement(By.xpath("//span[@role='combobox']/../../../select"));
		Select s2=new Select(country);
		s2.selectByVisibleText("India");
		
		WebElement dobYear = driver.findElement(By.id("yearbox"));
		Select s3=new Select(dobYear);
		s3.selectByVisibleText("1993");
		
		WebElement dobMonth = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s4=new Select(dobMonth);
		s4.selectByIndex(2);
		
		WebElement dobDay = driver.findElement(By.id("daybox"));
		Select s5=new Select(dobDay);
		s5.selectByValue("22");
		
		WebElement countries = driver.findElement(By.xpath("//select[@id='countries']"));
		Select s7=new Select(countries);
		s7.selectByVisibleText("Select Country");
		
		driver.findElement(By.id("firstpassword")).sendKeys("Password123*");
		driver.findElement(By.id("secondpassword")).sendKeys("Password123*");
		
		driver.findElement(By.id("submitbtn")).submit();
		
		
		

		Thread.sleep(10000);
		//driver.close();
	}

}
