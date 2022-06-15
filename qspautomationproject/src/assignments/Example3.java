package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("laptops");
		driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
		
		driver.findElement(By.xpath("(//div[@class=\"_24_Dny\"])[1]")).click();

	}

}
