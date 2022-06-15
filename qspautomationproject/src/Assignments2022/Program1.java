package Assignments2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.xpath("//input[@id=\"identifierId\"]")).sendKeys("tejashri.kudupudi17@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[.=\"Next\"]")).click();
		
		//driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("8805565349");
		//driver.findElement(By.xpath("//span[.='Next']")).click();

	}

}
