package HandlingTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://irctc.com/contact.html");
		driver.findElement(By.xpath("(//a[@class='collapsed'])[1]")).click();
		List<WebElement> contents = driver.findElements(By.xpath("//td"));
		
		for(WebElement con:contents) {
			System.out.println(con.getText());
		}

}
}
