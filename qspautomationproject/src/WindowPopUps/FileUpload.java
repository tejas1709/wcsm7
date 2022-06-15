package WindowPopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload 
{ 
   public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("http://laptop-4niojnbr/login.do;jsessionid=1hd9ee28he3wu");
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
		
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text()='Settings']")).click();
		
	/*	driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		driver.findElement(By.xpath("//input[@id=\"uploadNewLogoOption\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"formCustomInterfaceLogo.logo\"]")).click();*/
		
}	
}
