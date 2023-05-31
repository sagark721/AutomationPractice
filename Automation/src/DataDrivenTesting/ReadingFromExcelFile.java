package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		FileInputStream fis =new FileInputStream("./data/Demo1.xlsx");

		Workbook wb = WorkbookFactory.create(fis);
		
		String data = wb.getSheet("Details").getRow(1).getCell(1).getStringCellValue();
		//System.out.println(data);
		
		//System.out.println("Name: "+ wb.getSheet("Details").getRow(1).getCell(1).getStringCellValue());

		
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
			System.out.println("Person: "+i);
			System.out.println("Name: "+ wb.getSheet("Details").getRow(i).getCell(j).getStringCellValue());
			System.out.println("UserName: "+ wb.getSheet("Details").getRow(i).getCell(j+i).getStringCellValue());
			System.out.println("Password: "+ wb.getSheet("Details").getRow(i).getCell(j+i).getStringCellValue());


			}

		}
		


	}

}
