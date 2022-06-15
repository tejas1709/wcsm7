package mouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Not now')]")).click();
		
		WebElement web = driver.findElement(By.xpath("//a[contains(text(),'Rings')]"));
		Actions act=new Actions(driver);
		
		act.moveToElement(web).perform();

	}

}
