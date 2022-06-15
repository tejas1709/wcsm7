package TakeScreenShotDynamically;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners(CustomeListener.class)


public class TestCase extends BaseTest{

	@BeforeMethod
	public void setUp()
	{
		initilization();
		
	}
	
	
	@Test	
	public void validLogin() throws InterruptedException 
	{
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//-----------------Hard Assert----------------------//
		WebElement dashboard = driver.findElement(By.xpath("//h1[.='Dashboard']"));
		boolean status = dashboard.isDisplayed();
		Assert.assertEquals(status, true);
		Thread.sleep(2000);
		
	}
	
	@Test
	public void testcase2()
	{
		Assert.fail();
	}
	
	@Test
	public void testcase3()
	{
		Assert.fail();
	}
	
	@Test
	public void testcase4()
	{
		Assert.fail();
	}
	
	@Test
	public void testcase5()
	{
		Assert.fail();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
