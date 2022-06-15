package webDriverMethods;
import org.openqa.selenium.Point;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageSetPoisitionMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://myntra.com");
		
		  Point targetPosition = new Point(50,250);
		 driver.manage().window().setPosition(targetPosition);
	}
}
