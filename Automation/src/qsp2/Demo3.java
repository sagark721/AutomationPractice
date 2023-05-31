package qsp2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.seleniumhq.org");
  String expectedUrl="https://www.selenium.dev/";
  String actualUrl=driver.getCurrentUrl();
  if(expectedUrl.equals(actualUrl)) {
	  System.out.println("Url is successfully navigate & pass");
  }
  else {
	  System.out.println("Url is successfully navigate & fail");
  }
  driver.close();
	}

}
