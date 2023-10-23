package webelementmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		
	     Thread.sleep(2000);
		//identify usernametextbox and pass inputs
		driver.findElement(By.name("username")).sendKeys("ka.patil88");
		//identify passwordtextbox and pass inputs
		driver.findElement(By.name("password")).sendKeys("Kajal@123");
		//identify loginbutton and click
		driver.findElement(By.xpath("//div[text()='Log in']")).click();

		WebElement  logoutLinkElement = driver.findElement(By.xpath("//button[text()='Log out']"));           //submit
		
	
		boolean status = logoutLinkElement.isDisplayed();
		System.out.println(status);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/////////////////////////////////////////////////////////////////////////////////////
		
		boolean isElementDisplayed = driver.findElement(By.xpath("//span[text()='Login']")).isDisplayed();
		System.out.println(isElementDisplayed );	
		
		boolean isElementSelected = driver.findElement(By.xpath("//span[text()='Login']")).isSelected();
		System.out.println(isElementSelected );
		
		boolean isElementEnabled = driver.findElement(By.xpath("//span[text()='Login']")).isEnabled();
		System.out.println(isElementEnabled );
		
	
	
	}
}
