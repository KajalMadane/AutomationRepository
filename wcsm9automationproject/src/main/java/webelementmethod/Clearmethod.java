package webelementmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clearmethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicit WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/accounts/login/");
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("admin");
		 usnTB.clear();
		WebElement passTB = driver.findElement(By.name("password"));
		passTB.sendKeys("admin@123");
	//	passTB.clear();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("password")).clear();
		
		
		
	}

	
}
	




