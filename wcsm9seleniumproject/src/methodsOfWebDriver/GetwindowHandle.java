package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowHandle {
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//launch the webapplication
		driver.get("http://omayo.blogspot.com/");
		//stop the execution for 2 sec
		Thread.sleep(2000);
		//address of  the current window or browser
		//parent browser
		String parentHandel = driver.getWindowHandle();
		System.out.println(parentHandel);
		driver.close();
		
	}
	

}
