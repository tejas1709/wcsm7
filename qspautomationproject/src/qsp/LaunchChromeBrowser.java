package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		System.out.println("Good morning");
		new ChromeDriver(); //open the chrome browser

	}

}
