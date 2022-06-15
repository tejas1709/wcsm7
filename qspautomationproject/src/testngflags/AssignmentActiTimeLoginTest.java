package testngflags;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AssignmentActiTimeLoginTest
{

	@Parameters({"browser","username","password"})
	@Test
	public void LaunchBrowser(String browser,String user, String pass) throws InterruptedException
	{

		WebDriver driver;
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
			driver.get("http://laptop-4niojnbr/login.do");
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys(user);
			driver.findElement(By.name("pwd")).sendKeys(pass);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.close();
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
			driver.get("http://laptop-4niojnbr/login.do");
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys(user);
			driver.findElement(By.name("pwd")).sendKeys(pass);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.close();

		}
		else
		{
			Reporter.log("Entered invalid value",true);
		}

	}

}
