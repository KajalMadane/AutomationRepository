package javascriptexicutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Omayodisablewebelementss {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		 Thread.sleep(2000);
		 
		 WebElement disableSymbol = driver.findElement(By.id("tb2"));
			
		 Point loc =disableSymbol.getLocation();
		 int xaxis=loc.getX();
		 int yaxis=loc.getY();
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 Thread.sleep(2000);
		 jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		 //jse.executeScript(argument[0].scrollIntoView)
		 Thread.sleep(2000);
		 jse.executeScript("document.getElementById('tb2').value='Automation Testing'");
		 
		  File src =disableSymbol.getScreenshotAs(OutputType.FILE);
		//difinig way for storing screenshot
		File dest = new File("./ScreenshotsAS/disable.png");
		//store the screenshot into the dest
		Files.copy(src, dest);
		 
}
}
