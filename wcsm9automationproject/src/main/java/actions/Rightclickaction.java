package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclickaction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/radio");
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		
		 Thread.sleep(2000);
		
		   driver.findElement(By.xpath("Right Click"));
		      WebElement rightclick1 = driver.findElement(By.xpath("//button[text()='Right Click'][1]"));
		      Thread.sleep(2000);
		  WebElement rightclick2 = driver.findElement(By.xpath("//button[text()='Right Click'][2]"));
		  Thread.sleep(2000);
		   WebElement rightclick3 = driver.findElement(By.xpath("//button[text()='Right Click'][3]"));
		   Thread.sleep(2000);
		   Actions act = new Actions(driver);
		   
		   act.contextClick(rightclick1).perform();
		   Thread.sleep(2000);
		   act.contextClick(rightclick2).perform();
		   Thread.sleep(2000);
			 act.contextClick(rightclick3).perform();
			 Thread.sleep(2000);
}
}
