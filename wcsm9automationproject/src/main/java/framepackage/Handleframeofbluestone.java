package framepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleframeofbluestone {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		 Thread.sleep(2000);
		 
driver.findElement(By.id("denyBtn")).click();
Thread.sleep(2000);
WebElement frameElement = driver.findElement(By.id("fc_widget"));
//driver.switchTo().frame(6);//index
//driver.switchTo().frame("fc_widget");//string
driver.switchTo().frame(frameElement);
Thread.sleep(2000);
driver.findElement(By.id("chat-icon")).click();
Thread.sleep(2000);
driver.switchTo().defaultContent();
//driver.switchTo().parentFrame();
driver.findElement(By.id("chat-fc-name")).sendKeys("kajal");

driver.findElement(By.id("chat-fc-name")).sendKeys("kajal@123");

driver.findElement(By.id("chat-fc-phone")).sendKeys("888736427");

 driver.findElement(By.partialLinkText("Start Chat")).click();
 
 
 
 
}
}
