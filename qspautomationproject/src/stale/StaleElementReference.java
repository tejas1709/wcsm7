package stale;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReference
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("http://laptop-4niojnbr/login.do;jsessionid=19d2t9iepvm8i");
		
		Thread.sleep(2000);
		
		WebElement usn = driver.findElement(By.name("username"));
		WebElement psd = driver.findElement(By.name("pwd"));
		usn.sendKeys("admin");
		
		Thread.sleep(3000);
		
		usn.sendKeys("new");
		
	}

}
