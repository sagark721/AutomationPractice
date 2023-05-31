package qsp2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlignFacebookGenderButton {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@role='button']/../../div[5]/a[1]")).click();
		Thread.sleep(5000);
		int a1 = driver.findElement(By.xpath("//input[@type='radio']/../../span[1]/input[1]")).getLocation().getY();
		int a2 = driver.findElement(By.xpath("//input[@type='radio']/../../span[2]/input[1]")).getLocation().getY();
		int a3 = driver.findElement(By.xpath("//input[@type='radio']/../../span[3]/input[1]")).getLocation().getY();
		if (a1==a2 && a1==a3)
			System.out.println("All Gender Buttons are Aligned & Pass");
		else
			System.out.println("All Gender Buttons are not Aligned & Fail");
		driver.close();

	}
}