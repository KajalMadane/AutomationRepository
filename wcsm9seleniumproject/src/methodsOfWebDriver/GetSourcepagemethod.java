package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSourcepagemethod {
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//launch the webapplication
		driver.get("https://www.actitime.com/");
		//source code foe login page
		String loginpagesourcecode = driver.getPageSource();
		System.out.println(loginpagesourcecode);
		Thread.sleep(4000);
		driver.close();
		
		
	}

}
