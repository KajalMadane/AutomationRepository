package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//close the popup window
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	//close the search box
	driver.findElement(By.name("q")).sendKeys("mobiles");
	//search icon and click
	driver.findElement(By.xpath("//button[contains(@aria-label,'Search for Products, Brands and More')]")).click();
	//print prize of 2nd option
	
	}
}
		


