package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	public static void main(String[] args) throws InterruptedException {
		//launch the chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//launch webapplication
		driver.get("https://www.actitime.com/");
		//stop the execution for 2 sec
		Thread.sleep(4000);
		//grt title of current webpage
		String loginpageTitle = driver.getTitle();
		System.out.println(loginpageTitle);
		//System.out.println(driver.gettitle);
		Thread.sleep(4000);
		driver.close();

   }
}
