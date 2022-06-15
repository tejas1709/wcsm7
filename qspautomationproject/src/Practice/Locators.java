package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///D:/QSpiders%20class/Selenium/Compnents/textbox.html");
	driver.findElement(By.id("i1")).sendKeys("Trips");
	}

}

