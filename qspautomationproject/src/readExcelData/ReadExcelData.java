package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(file);
	   Sheet sh = wb.getSheet("Sheet1");
	   Row row = sh.getRow(1);
	   Cell cell = row.getCell(0);
	   String data = cell.getStringCellValue();
	   System.out.println(data);
		
	}
	

}
