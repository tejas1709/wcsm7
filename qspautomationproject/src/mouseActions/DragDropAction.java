package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropAction {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(4000);
		
		WebElement src = driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
		WebElement target = driver.findElement(By.xpath("//ol[@id='loan']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(src, target).perform();
		
		


	}

}
