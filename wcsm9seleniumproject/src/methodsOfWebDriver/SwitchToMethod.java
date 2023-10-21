package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {
	public static void main(String[] args) throws InterruptedException {
		     //launch the chrome browser
				WebDriver driver=new ChromeDriver();
			    //maximize the browser
			   driver.manage().window().maximize();
				//launch the webapplication
				driver.get("https://google.com/");
				//stop the execution for 2 sec
				Thread.sleep(2000);
				driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
				//close the browser
				
				
	}

}
