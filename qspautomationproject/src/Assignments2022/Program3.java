package Assignments2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Program3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/droppable/");
		
		Thread.sleep(1000);
		
		
        WebElement src = driver.findElement(By.xpath("//p[.='Drag me to my target']"));
        WebElement trg = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
        Actions act=new Actions(driver);
		act.dragAndDrop(src, trg).perform();
	}
	

}
