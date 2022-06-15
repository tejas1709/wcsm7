package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/QSpiders%20class/Selenium/Links/link.html");
		driver.manage().window().maximize();
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
		
		
		
	}

}
