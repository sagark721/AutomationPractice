package qsp2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
  ChromeDriver driver=new ChromeDriver();
  driver.get("https://www.google.com");
  String title=driver.getTitle();
  System.out.println(title);
  driver.close();
  driver.get("https://www.youtube.com");
  driver.close();
	}

}
