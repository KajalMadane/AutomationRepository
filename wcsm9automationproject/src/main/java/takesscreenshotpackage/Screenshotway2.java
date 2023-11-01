package takesscreenshotpackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Screenshotway2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		//take screenshot of the webpage

		 WebElement coinElement = driver.findElement(By.xpath("//a[text()='Coins']"));
		 Thread.sleep(2000);
		 Actions act = new Actions(driver);
		 
		 
		act.moveToElement(coinElement).build().perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
		 
		 //take screeshot
		 Thread.sleep(2000);
	WebElement coinElement1 = driver.findElement(By.xpath("//img[@alt='1 gram 24 KT Gold Coin']"));
		
		 File src =  coinElement1.getScreenshotAs(OutputType.FILE);
		//difinig way for storing screenshot
		File dest = new File("./ScreenshotsAS/coinElement.png");
		//store the screenshot into the dest
		Files.copy(src, dest);
		

}
}
