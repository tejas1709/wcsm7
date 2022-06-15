package pageobjectmodel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant
{
	static WebDriver driver;

	public void setUp() throws IOException
	{
		Flib flib=new Flib();
		String browser = flib.readPropData(PROP_PATH,"browser");
		String url = flib.readPropData(PROP_PATH,"url");

		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.get(url);

		}

		else if(browser.equalsIgnoreCase("firefox"))
		{
			
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.get(url);
		}

	}

	public void tearDown()
	{
		driver.quit();
	}

}
