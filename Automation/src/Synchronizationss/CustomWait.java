package Synchronizationss;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String userName = driver.findElement(By.xpath("(//td[text()='Username: '])[1]/b")).getText();
		String password = driver.findElement(By.xpath("(//td[text()='Password: '])[1]/b")).getText();
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		int i=0;
		boolean a=true;
		while(i<100) {
		try {
			driver.findElement(By.id("logoutLink")).click();
			break;
		}
		catch(NoSuchElementException e){
			System.out.println(i);
			i++;
		}
		}
		Thread.sleep(7000);
		driver.close();
		
	}

}
