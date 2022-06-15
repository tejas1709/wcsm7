package Assignments2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program14 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Not now')]")).click();
		WebElement web = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(web).perform();
		
		driver.findElement(By.xpath("//a[.='Gold Coins']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[.='1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id=\"pid_5920\"]/ancestor::div[@class=\"p-image\"]")).click();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//span[.='Gold Coin In 24Kt Gold']")).getText();
		System.out.println(text);

	}

}
