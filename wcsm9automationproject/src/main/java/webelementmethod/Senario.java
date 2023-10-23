package webelementmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Senario {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("nav-search-submit-button")).sendKeys("Apple Watches");
		driver.findElement(By.xpath("//input[@aria-label='Search Amazon']")).click();
		//driver.findElement(By.xpath("")).click();
		
		
		
		
		
		
		
	
		
	}
	

}
