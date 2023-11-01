package robotpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotbluestone {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/jewellery/watch+jewellery.html");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("denyBtn")).click();
		    WebElement watch_jewelleryTarget = driver.findElement(By.xpath("//a[@title='Watch Jewellery ']"));
			  Actions act = new Actions(driver);
		act.moveToElement(watch_jewelleryTarget).build().perform();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='Band']")).click();
		 WebElement FilteredTarget = driver.findElement(By.xpath("//span[text()='FILTERED BY']"));
		 for(int i=1;i<=2;i++)
		 {
			 act.doubleClick(FilteredTarget).perform();
			 Thread.sleep(2000);
			 act.clickAndHold(FilteredTarget).perform();
		 }
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			 driver.findElement(By.xpath("//input[@name='submit_search']")).click();
			
}
}
