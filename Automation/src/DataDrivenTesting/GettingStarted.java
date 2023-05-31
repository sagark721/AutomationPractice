package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingStarted {
	

	public static void main(String[] args) throws IOException {

		String path="./data/actitimedata1.property";
		FileInputStream fis= new FileInputStream(path);
		Properties p = new Properties();
		
		p.load(fis);
		
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("un"));
		System.out.println(p.getProperty("pwd"));
		System.out.println(p.getProperty("name"));
		
	}

}
