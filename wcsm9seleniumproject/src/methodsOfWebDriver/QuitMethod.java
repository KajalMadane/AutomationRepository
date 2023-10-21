package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//launch the webapplication
		driver.get("https:\\omayo.blogspot.com/");
		//stop the execution for2 sec
		Thread.sleep(2000);
		//open the link
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);
		//close the browser
		driver.quit();
    }
}