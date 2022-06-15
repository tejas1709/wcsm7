package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment0001 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		Thread.sleep(20000);
		//driver.findElement(By.xpath("//p[contains(@class=\'lc-o7mqve e16i86ec1\' ')]")).click();
		
		if(!driver.findElements(By.id("chat_id")).isEmpty()){
	        driver.findElement(By.id("chat")).click();
	    }
	}

}
