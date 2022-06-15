package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WebElementScreenshot {

	
		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			driver.get("https://unsplash.com/wallpapers/art/cartoon");
			
			WebElement element = driver.findElement(By.xpath("//h1[.='Hd cartoon wallpapers']"));
			
			File src = element.getScreenshotAs(OutputType.FILE);
			File trgt = new File("./screenshots/ss1.png");
			
			Files.copy(src, trgt);
			
			
			

	}

}
