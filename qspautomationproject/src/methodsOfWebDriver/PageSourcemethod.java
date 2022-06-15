package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSourcemethod {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/QSpiders%20class/Selenium/Compnents/checkbox.html");
		String SourceCodeOfPage = driver.getPageSource();
		System.out.println(SourceCodeOfPage);
		

	}

}
