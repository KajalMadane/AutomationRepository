package webelementmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/");
		
	WebElement  checkBoxElement = driver.findElement(By.id("//input[@type='checkbox']"));           //submit
	boolean status = checkBoxElement.isSelected();
	System.out.println(status);
	
	
	
	
	
	
		
		
		
		
	}

}
