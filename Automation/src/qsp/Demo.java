package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	static void test() {
		System.out.println("Hello");
	}
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.instagram.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
}

}
