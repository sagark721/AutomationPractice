package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxSelect {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Qspiders/SELENIUM/Hotel.html");
		
		WebElement mtr = driver.findElement(By.id("mtr"));
		
		Select s=new Select(mtr);
		
		List<WebElement> options = s.getOptions();
		
		for(WebElement option:options) {
			System.out.println(option.getText());
			if(option.getText().equals("Idly") || option.getText().equals("Vada")) {
				s.selectByVisibleText("Idly");
				s.selectByVisibleText("Vada");
			}
		}
		
		
	}

}
