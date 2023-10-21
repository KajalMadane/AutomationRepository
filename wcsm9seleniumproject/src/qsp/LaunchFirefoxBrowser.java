package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		//to launch Firefox browser we need create obj of FirefoxDriver();
		
		WebDriver driver=new FirefoxDriver();
		//how to maximize window
		driver.manage().window().maximize();
		System.out.println("Firefox is open");
		//stop the execution for 2 sec
		Thread.sleep(2000);
		//how to close firefox`						`
		driver.close();
		System.out.println("Firefox is close");
		
	}
}
