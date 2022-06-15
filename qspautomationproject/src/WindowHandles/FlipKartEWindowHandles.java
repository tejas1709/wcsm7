package WindowHandles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartEWindowHandles 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung f12");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F12 (Sea Green, 64 GB)']")).click();

		String parent = driver.getWindowHandle();
		
		
		Set<String> allhandles = driver.getWindowHandles();
		
		for(String wh: allhandles)
		{
			if(!parent.equals(wh))
			{
				driver.switchTo().window(wh);
			}
			else
			{
				
			}
			
		}
		
		
		
		
		driver.findElement(By.xpath("//a[.='128 GB']")).click();
		driver.findElement(By.xpath("//li[@id='swatch-0-color']")).click();
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("411033");
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).click();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
	}
		

}
