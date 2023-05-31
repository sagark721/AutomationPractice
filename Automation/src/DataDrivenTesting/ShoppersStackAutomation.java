package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppersStackAutomation {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		WebDriverWait wait=new WebDriverWait(driver, 60);
		FileInputStream fis= new FileInputStream("./data/ShoppersStackUrl.property");
		Properties p= new Properties();
		p.load(fis);

		driver.get(p.getProperty("url"));
		String passMsg="Successfully Registered";
		String failMsg="Given Email ID or Phone number already used";
		FileInputStream fis2=new FileInputStream("./data/ShopperStackUserDetails1 - Copy.xlsx");
		Workbook wb = WorkbookFactory.create(fis2);

		int rowcount=wb.getSheet("UserDetails").getLastRowNum();
		

		for(int i=1;i<=rowcount;i++) {
			int j=0;

			wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
			//Thread.sleep(7000);
			driver.findElement(By.id("loginBtn")).click();
			driver.findElement(By.xpath("//span[text()='Create Account']")).click();
			driver.findElement(By.id("First Name")).sendKeys(wb.getSheet("UserDetails").getRow(i).getCell(j).getStringCellValue());
			driver.findElement(By.id("Last Name")).sendKeys(wb.getSheet("UserDetails").getRow(i).getCell(j+1).getStringCellValue());

			if(wb.getSheet("UserDetails").getRow(i).getCell(j+2).getStringCellValue().equals("m")) {
				driver.findElement(By.id("Male")).click();
			}
			else {
				driver.findElement(By.id("Female")).click();
			}


			driver.findElement(By.id("Phone Number")).sendKeys(wb.getSheet("UserDetails").getRow(i).getCell(j+3).getStringCellValue());

			driver.findElement(By.id("Email Address")).sendKeys(wb.getSheet("UserDetails").getRow(i).getCell(j+4).getStringCellValue());

			driver.findElement(By.id("Password")).sendKeys(wb.getSheet("UserDetails").getRow(i).getCell(j+5).getStringCellValue());

			driver.findElement(By.id("Confirm Password")).sendKeys(wb.getSheet("UserDetails").getRow(i).getCell(j+6).getStringCellValue());

			driver.findElement(By.id("Terms and Conditions")).click();

			driver.findElement(By.id("btnDisabled")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']")));
			String text = driver.findElement(By.xpath("//div[@role='alert']")).getText();
			FileOutputStream fos=new FileOutputStream("./data/ShopperStackUserDetails1-Copy.xlsx");
			if(text.equals(passMsg))
			{
				System.out.println("Pass");
				//System.out.println(text);
				wb.getSheet("UserDetails").getRow(i).getCell(j+7).setCellValue("Pass");
				wb.write(fos);
				wb.close();
			}
			else if (text.equals(failMsg)) 
			{
				System.out.println("Fail");
				wb.getSheet("UserDetails").getRow(i).getCell(j+7).setCellValue("Fail");
				wb.write(fos);
				wb.close();
				driver.findElement(By.xpath("(//img[@alt='logo'])[1]")).click();
			}
			driver.findElement(By.xpath("//div[@role='alert']/../button")).click();
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Successfully Registered']")));
			//if(driver.findElement(By.xpath("//div[text()='Successfully Registered']")).equals("Successfully Registered")) {
			//	System.out.println("Pass");
			

			}
		}




	}

