package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inatagram {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		//identify usernametextbox and pass inputs
		driver.findElement(By.xpath("//input[contains(@name,'u')]")).sendKeys("ka.patil88");
		//identify passwordtextbox and pass inputs
		driver.findElement(By.xpath("//input[contains(@name,'p')]")).sendKeys("Kajal@123");
		//identify loginbutton and click
		driver.findElement(By.xpath("//button[contains(@class,'acap')]")).click();
		//or using text()
		//driver.findElement(By.xpath("//div[contains(text(),'L')]")).click();		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
