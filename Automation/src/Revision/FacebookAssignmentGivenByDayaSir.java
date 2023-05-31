package Revision;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssignmentGivenByDayaSir {

	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		////// TAKING INPUTS FROM FACEBOOK ///////
		
		
		
		//Days
		WebElement day = driver.findElement(By.name("birthday_day"));
		
		Select s= new Select(day);
		List<WebElement> days = s.getOptions();
		for(int i=0;i<days.size();i++) {
			System.out.println(days.get(i).getText());
		}
		
		System.out.println(days.size());
		
		FileInputStream fis= new FileInputStream("./data/Facebook.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		int k=0;
		for(int i=1;i<=days.size();i++) {
			int j=0;
			
			wb.getSheet("Sheet1").getRow(i).getCell(j).setCellValue(days.get(k++).getText());
			
		}
		
		//Months
		WebElement month = driver.findElement(By.id("month"));
		Select s1= new Select(month);
		List<WebElement> months = s1.getOptions();
		
		int l=0;
		int j=1;
		for(int i=1;i<=months.size();i++) {
			
			wb.getSheet("Sheet1").getRow(i).getCell(j).setCellValue(months.get(l++).getText());
		}
		
		
		//Years
		WebElement year = driver.findElement(By.id("year"));
		Select s2= new Select(year);
		List<WebElement> years = s2.getOptions();
		
		int l2=0;
		int j2=2;
		for(int i=1;i<=years.size();i++) {
			
			wb.getSheet("Sheet1").getRow(i).getCell(j2).setCellValue(years.get(l2++).getText());
		}
		
		
		Thread.sleep(5000);
		FileOutputStream fos= new FileOutputStream("./data/Facebook.xlsx");
		wb.write(fos);
		Thread.sleep(5000);
		wb.close();
			
		Thread.sleep(5000);
	
		boolean res = days.get(0).getText().equals(wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue());
	
		System.out.println(res);
		
		/////// VERIFYING  ///////
		Thread.sleep(5000);
		FileInputStream fis2= new FileInputStream("./data/Facebook.xlsx");
		
		Workbook wb2 = WorkbookFactory.create(fis2);
		
		
		////DAYS////
		int l1=0;
		int j1=0;
		int m1=4;
		for(int i=1;i<=days.size();i++) {
			String fbday = days.get(l1++).getText();
			String sheetday = wb2.getSheet("Sheet1").getRow(i).getCell(j1).getStringCellValue();
			if(fbday.equals(sheetday)) {
			wb2.getSheet("Sheet1").getRow(i).getCell(m1).setCellValue(fbday+" in Facebook is equals to "+ sheetday+" in this sheet");
			}
		}
		
		
		////MONTHS////
		int l3=0;
		int m3=1;
		int mm3=5;
		for(int i=1;i<=months.size();i++) {
			String fbmonth = months.get(l3++).getText();
			String sheetmonth = wb2.getSheet("Sheet1").getRow(i).getCell(m3).getStringCellValue();
			if(fbmonth.equals(sheetmonth)) {
			wb2.getSheet("Sheet1").getRow(i).getCell(mm3).setCellValue(fbmonth+" in Facebook is equals to "+ sheetmonth+" in this sheet");
			}
		}
		
		
		//// YEARS  ///
		int l4=0;
		int m4=2;
		int mm4=6;
		for(int i=1;i<=years.size();i++) {
			String fbyear = years.get(l4++).getText();
			String sheetyear = wb2.getSheet("Sheet1").getRow(i).getCell(m4).getStringCellValue();
			if(fbyear.equals(sheetyear)) {
			wb2.getSheet("Sheet1").getRow(i).getCell(mm4).setCellValue(fbyear+" in Facebook is equals to "+ sheetyear+" in this sheet");
			}
		}
		
		
		
		
		Thread.sleep(5000);
		FileOutputStream fos2= new FileOutputStream("./data/Facebook.xlsx");
		Thread.sleep(5000);
		wb2.write(fos2);
		Thread.sleep(5000);
		wb2.close();
	}
}