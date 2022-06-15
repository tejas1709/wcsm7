package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeInvalidTest extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		BaseTest bt=new BaseTest();
		Flib flib=new Flib();
		
		bt.openBrowser();
		int rc = flib.rowCount(EXCEL_PATH, "invalidcreds");
		
		
		for(int i=1;i<=rc;i++)
		{
			
			
			String username = flib.readExcelData(EXCEL_PATH, "invalidcreds", 1, 0);
			String password = flib.readExcelData(EXCEL_PATH, "invalidcreds", 1, 1);
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
			
			
			
		}
	
		bt.closeBrowser();
	}

}
