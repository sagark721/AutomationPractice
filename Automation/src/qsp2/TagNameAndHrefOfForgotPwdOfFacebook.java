package qsp2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameAndHrefOfForgotPwdOfFacebook {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			WebElement e = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
			String tag = e.getTagName();
			String link = e.getAttribute("href");
			System.out.println("The Tag Name is: "+tag);
			System.out.println("The Link is: "+link);
			driver.close();
			
		}
	}

