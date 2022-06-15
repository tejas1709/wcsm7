package assertsiontestng;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHrmLogin 
{
	
	WebDriver driver;
	
	@BeforeTest
	public void setproperty()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	@BeforeMethod
	public void launchbrowser()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@Test
	public void testcase() throws InterruptedException
	{
		
		SoftAssert s = new SoftAssert();
		String LoginPageTime = driver.getTitle();	
		s.assertEquals(LoginPageTime, "OrangeHRM");
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//-----------------Hard Assert----------------------//
		WebElement dashboard = driver.findElement(By.xpath("//h1[.='Dashboard']"));
		boolean status = dashboard.isDisplayed();
		Assert.assertEquals(status, true);
		Thread.sleep(2000);
		
		
		//----------------------Soft Assert----------------------//
		String HomePageTitle = driver.getTitle();
		s.assertEquals(HomePageTitle, "OrangeHRM");
		
		
		Reporter.log("Create user",true);
		Reporter.log("Create contact",true);
		
		
		s.assertAll();
		
		
		
		
		
		
	}

}
