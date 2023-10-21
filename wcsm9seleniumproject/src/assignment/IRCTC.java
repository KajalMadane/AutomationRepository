package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTC {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//label[text()='From']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("PUNE");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//label[text()='To']")).click();
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//label[text()='DD/MM/YYYY *']")).click();
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//a[@data-date='25']")).click();
		//Thread.sleep(2000);
		
		////driver.findElement(By.xpath("//button[text()='Search']")).click();
		//Thread.sleep(2000);
		
	}

}
