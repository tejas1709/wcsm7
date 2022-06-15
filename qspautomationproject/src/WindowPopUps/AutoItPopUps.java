package WindowPopUps;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoItPopUps 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	driver.get("http://laptop-4niojnbr/login.do;jsessionid=19d2t9iepvm8i");
	
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
	
	driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.linkText("Settings")).click();
	
	driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
	driver.findElement(By.xpath("//input[@id=\"uploadNewLogoOption\"]")).click();
	
	Actions act = new Actions(driver);
	WebElement trg = driver.findElement(By.xpath("//input[@name=\"formCustomInterfaceLogo.logo\"]"));
	
	act.doubleClick(trg).perform();
	
	
	File a = new File("./AutoItScript/fu1.exe");
	 String abst = a.getAbsolutePath();
	 Runtime.getRuntime().exec(abst);
	Thread.sleep(6000);
	Runtime.getRuntime().exec(abst);
	
	
	}

}
