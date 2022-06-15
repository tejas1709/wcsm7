package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("laptop");		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		String text=driver.findElement(By.xpath("//span[.='HP Pavilion 14,11th Gen Intel Core i5 16GB RAM/512GB SSD 14 inch(35.6 cm),FHD IPS Anti-Glare Display/Intel Iris Xe Graphics/Backlit KB/B&O Audio/FPR/Win 11/Thin & Light/1.41kg, 14-dv1001TU']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[.='64,990']")).getText();
		System.out.println(text);
		//driver.findElement(By.xpath("//span[.='HP Pavilion 14,11th Gen Intel Core i5 16GB RAM/512GB SSD 14 inch(35.6 cm),FHD IPS Anti-Glare Display/Intel Iris Xe Graphics/Backlit KB/B&O Audio/FPR/Win 11/Thin & Light/1.41kg, 14-dv1001TU']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[.='64,990']")).click();
	}

}
