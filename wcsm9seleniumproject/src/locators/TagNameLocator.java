package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/wcsm9webelements/loginpage.html");
		Thread.sleep(2000);
		//identify usernameTB and pass input as admin
		driver.findElement(By.id("i1")).sendKeys("admin");
		//identify passwordTB and pass input asmanager  
		Thread.sleep(2000);
		driver.findElement(By.id("i2")).sendKeys("manager");
		
		}

}



