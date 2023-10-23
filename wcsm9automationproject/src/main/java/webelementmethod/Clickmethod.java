package webelementmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickmethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		//identify usernametextbox and pass inputs
		driver.findElement(By.name("username")).sendKeys("admin");
		//identify passwordtextbox and pass inputs
		driver.findElement(By.name("password")).sendKeys("manager@123");
		//identify loginbutton and click
		driver.findElement(By.xpath("//div[text()='Log in']")).click();


	}
	}



