package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment0202 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
	    List<WebElement> suggestion = driver.findElements(By.xpath("(//div[@class=\"xtXmba\"])[4]"));
		
		for(WebElement sugg:suggestion)
		{
			String text=sugg.getText();
			System.out.println(text);
		}
		

	}

}
