package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib 
{
	
	public String readExcelData(String excelpath, String sheetName,int rowcount,int cellcount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
		return data;
		
	}
	 public int getrowCount(String excelpath, String sheetName) throws EncryptedDocumentException, IOException
	 {
		 FileInputStream fis = new FileInputStream(excelpath);
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet(sheetName);
		 int rc=sh.getLastRowNum();
		return rc;
		 
	 }

}
