package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Screenshot2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		RemoteWebDriver rwd=(RemoteWebDriver)driver;
		File src = rwd.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshots/screenshot2.png");
		Files.copy(src, trg);

	}

}
