package pageobjectmodel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib 
{
	
	public String readExcelData(String excelpath, String sheetName,int rowcount, int cellcount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new  FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
		return data;
		
		
	}
	
	
	public int rowCount(String excelpath,String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rc = sh.getLastRowNum();
		return rc;
		
	}
	
	
	public void writeExcelData(String excelpath,String sheetName,int rowcount, int cellcount,int data) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowcount);
		Cell cell = row.createCell(cellcount);
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream("./data/ActiTimeTestData.xlsx");
		wb.write(fos);
	}
	
	public String  readPropData(String proppath, String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(proppath);
		Properties prop=new Properties();
		prop.load(fis);
		
		String value = prop.getProperty(key);
		return value;
	}
	
	
	

}
