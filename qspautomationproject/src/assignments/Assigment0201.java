package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment0201 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//a[@class=\"_3SkBxJ\"]")).click();
		//driver.findElement(By.xpath("//a[@class=\"_1_3w1N\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _1sbqEe _3AWRsL\"]")).click();
		

	}

}
