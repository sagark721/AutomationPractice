package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FontDetailsOfForgotPwdLink {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement link = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		String font_name = link.getCssValue("font-family");
		String font_size = link.getCssValue("font-size");
		System.out.println(font_name);
		System.out.println(font_size);
	

}
}
