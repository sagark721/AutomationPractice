package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlignmentOfRadioButtonFB {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement button = driver.findElement(By.xpath("//a[@rel='async']"));
		button.click();
		Thread.sleep(4000);
		int yOfM = driver.findElement(By.xpath("//input[@value='1']")).getLocation().getY();
		int yOfF=driver.findElement(By.xpath("//input[@value='2']")).getLocation().getY();
		int yOfC=driver.findElement(By.xpath("//input[@value='-1']")).getLocation().getY();
		if(yOfM==yOfF && yOfF==yOfC)
		{
			System.out.println("Aligned");
		}
		else
		{
			System.out.println("Not Aligned");
		}
	}

}
