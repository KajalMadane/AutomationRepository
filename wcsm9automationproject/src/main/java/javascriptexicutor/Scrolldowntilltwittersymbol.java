package javascriptexicutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Scrolldowntilltwittersymbol {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		//scroll till twitter symbol
		WebElement twitterSymbol = driver.findElement(By.xpath("//i[@class='fab fa-twitter']"));
		
Point loc =twitterSymbol.getLocation();
int xaxis=loc.getX();
int yaxis=loc.getY();
JavascriptExecutor jse = (JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");


//call the method
File src = twitterSymbol.getScreenshotAs(OutputType.FILE);
//difinig way for storing screenshot
File dest = new File("./ScreenshotsAS/twitter.png");
//store the screenshot into the dest
Files.copy(src, dest);



}
}
