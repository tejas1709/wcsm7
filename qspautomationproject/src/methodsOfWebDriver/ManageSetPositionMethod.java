package methodsOfWebDriver;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageSetPositionMethod
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./data/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		Point target=new Point(50,250);
		
		
	}

}
