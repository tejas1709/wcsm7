package Assignments2022;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&authuser=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&TL=AM3QAYaj2LBVtgRkvxYEXC-0IBVXfIc5MH7yx4rsMzt_0zJBttADbS3da9W7Nemc");
			Thread.sleep(3000);
			
			driver.findElement(By.name("identifier")).sendKeys("tejashri.kudupudi17@gmail.com");
			driver.findElement(By.xpath("//span[.='Next']")).click();
			
			Thread.sleep(3000);
			driver.navigate().forward();
			driver.findElement(By.name("password")).sendKeys("8805565349");
			driver.findElement(By.xpath("//span[.='Next']")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@aria-label=\"Close\"]")).click();
			
			driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
			Thread.sleep(3000);
		
			driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("divyatapkir14@gmail.com");
			
			driver.findElement(By.xpath("//input[@id=':pg']")).sendKeys("Test Mail");
			
			driver.findElement(By.xpath("//div[@id=':ql']")).sendKeys("This is automated mail written by meh");

}
}