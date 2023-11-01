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

public class RobotandAction {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev");
		Thread.sleep(2000);
		  WebElement Getting_StartedTaget = driver.findElement(By.xpath("//h2[text()='News']"));
		  Actions act = new Actions(driver);
		act.contextClick(Getting_StartedTaget).build().perform();
		
		//press page down go till to inspect 
		 Robot robot = new Robot();
		for(int i=0;i<=10;i++)
		{
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}
		//press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
}
}