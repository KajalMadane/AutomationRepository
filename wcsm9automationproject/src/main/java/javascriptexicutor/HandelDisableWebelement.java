package javascriptexicutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandelDisableWebelement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 Thread.sleep(2000);
		 jse.executeScript("document.getElementById('name').value='Kajal'");
		 Thread.sleep(2000);
		 jse.executeScript("document.getElementById('email').value='kajal123gmail.com'");
		Thread.sleep(2000);
	  jse.executeScript("document.getElementById('password').value='kajal123'");
			
			//click on disable register button
	WebElement disableRegisterButton = driver.findElement(By.xpath("//button[text()='Register']"));
if(disableRegisterButton.isDisplayed())
{
	jse.executeScript("arguments[0].click()",disableRegisterButton);
	jse.executeScript("arguments[0].click()",driver.findElement(By.xpath("//a[@type='button']")));
	System.out.println("click");
}
else
{
	System.out.println(" not click");
	
}

	
	
	
}
}
