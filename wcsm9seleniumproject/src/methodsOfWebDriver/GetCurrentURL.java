package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//launch the webapplication 
		driver.get("https://www.actitime.com/");
		//take the URL of login page
		String Urlofloginpage = driver.getCurrentUrl();
		System.out.println(Urlofloginpage);
		//stop the execution for 2 sec
		Thread.sleep(4000);
		driver.close();
		
		
		
		
	}

}
