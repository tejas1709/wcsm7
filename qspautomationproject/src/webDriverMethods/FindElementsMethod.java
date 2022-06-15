package webDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		
		driver.switchTo().activeElement().sendKeys("happy");
			
		List<WebElement> suggestion = driver.findElements(By.xpath("//input[@class='gLFyf gsfi']"));
		
		for( WebElement sugg: suggestion)
		{
			
			String text = sugg.getText();
			System.out.println(text);
			
		}
		
		//Thread.sleep(3000);
		
	}

}
