package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("http://laptop-4niojnbr/login.do;jsessionid=19d2t9iepvm8i");
		
		Thread.sleep(2000);
		// actitime login for valid credentials 
		
		
		FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		  Sheet sh = wb.getSheet("validcreds");
		 Row row = sh.getRow(1);
		 Cell cell = row.getCell(0);
		 String username = cell.getStringCellValue();
		 
		 System.out.println(username);
		 
		  FileInputStream fis2 = new FileInputStream("./data/ActiTimeTestData.xlsx");
			Workbook wb2= WorkbookFactory.create(fis2);
			  Sheet sh2 = wb2.getSheet("validcreds");
			 Row row2 = sh.getRow(1);
			 Cell cell2 = row2.getCell(1);
			 String password = cell2.getStringCellValue();
			 System.out.println(password);
			 
		//------------------------------------------------------------------------------------
		 
		  
		
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys(password);
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
		
	}
}
