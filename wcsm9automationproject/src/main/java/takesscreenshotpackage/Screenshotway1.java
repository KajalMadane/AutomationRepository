package takesscreenshotpackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshotway1 {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		//take screenshot of the webpage
		File src =  ( driver).getScreenshotAs(OutputType.FILE);
		//difinig way for storing screenshot
		File dest = new File("./ScreenshotsAS/demoappsss.png");
		//store the screenshot into the dest
		Files.copy(src, dest);

	}
}
