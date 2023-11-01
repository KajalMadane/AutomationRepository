package javascriptexicutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotUpDown {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		
		Thread.sleep(2000);
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		for(int i=1;i<=6;i++)
		{
		 Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,500)");
		 
		}
		
		
		//take screenshot of the webpage
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		//call the method
		File src = ts.getScreenshotAs(OutputType.FILE);
		//difinig way for storing screenshot
		File dest = new File("./ScreenshotsAS/seleniumss.png");
		//store the screenshot into the dest
		Files.copy(src, dest);
	  
	}
}
