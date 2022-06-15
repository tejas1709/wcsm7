package dataDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidCreds {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver,chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://laptop-4niojnbr/login.do;jsessionid=19d2t9iepvm8i");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		Flib f=new Flib();
		
		String username = f.readExcelData("./data/ActiTimeTestData","validcreds", 1, 0);
		String password=f.readExcelData("./data/ActiTimeTestData.xlsx", "validcreds", 1, 1);
		
		
		
		//------------------------------------------------------------------------------------
		 
		  
		
		
				driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
				driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys(password);
				driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
				
		
	}

}
