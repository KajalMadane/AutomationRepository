package framepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleframegoogle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com/");
		 Thread.sleep(2000);
		 
driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
Thread.sleep(2000);
//before clicking on maps swicth controlto frame
//identify frameand store it aswebelement
driver.switchTo().frame(1);
 driver.findElement(By.xpath("//span[text()='Maps']")).click();
//driver.switchTo().frame(1);//index
//driver.switchTo().frame("app");//string


	}
}
