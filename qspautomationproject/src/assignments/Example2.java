package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
		String text=driver.findElement(By.xpath("//div[.='POCO M3 Pro 5G (Yellow, 64 GB)']/ancestor::div[@class=\"_3pLy-c row\"]/descendant::div[@class=\"_30jeq3 _1_WHN1\"]")).getText();
		System.out.println(text);
	}

}
