package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathLocatore {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();
	driver.get("https://www.airvistara.com/in/en");

Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("PUQ");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("MPQ");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='depart']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@data-date='22']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@data-date='25']")).click();
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//input[@id='passengers']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@value='business']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("button[class*='passengerModelBtn']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("book-flight-widget")).click();
	Thread.sleep(2000);
	}

	

}


