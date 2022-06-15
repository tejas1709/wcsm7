package WindowPopUps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment11 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		
		driver.findElement(By.xpath("//span[.='Samsung']")).click();
		driver.findElement(By.xpath("//span[.='2,488']/ancestor::div[@class=\"sg-row\"]/descendant::img[@data-image-index=\"1\"]")).click();
	}

}
