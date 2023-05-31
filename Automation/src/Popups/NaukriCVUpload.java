package Popups;

import java.awt.AWTException;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import net.bytebuddy.implementation.FieldAccessor.FieldLocation.Absolute;

public class NaukriCVUpload {

		
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("sagark1431@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Password123#");
		driver.findElement(By.xpath("//button[text()='Login']")).submit();
		driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__bars']")).click();
		driver.findElement(By.xpath("//a[text()='View & Update Profile']")).click();
		//driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
		//Thread.sleep(7000);
		File f=new File("./data/Resume.pdf");
		String absPath = f.getAbsolutePath();
		driver.findElement(By.id("attachCV")).sendKeys(absPath);
		
		/*WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("policynumber")));
		
		*/
		
		WebElement msg = driver.findElement(By.xpath("//p[contains(text(),'successfully uploaded.')]"));
		if (msg.isDisplayed()) {
			System.out.println("pass: "+msg.getText()+" is displayed");
		}
		driver.close();
		
		//Resume has been successfully uploaded.


}
}
