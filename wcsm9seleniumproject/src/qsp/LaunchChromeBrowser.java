package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		//to launch chrome browser we need create obj of chromeDriver();
		
	 WebDriver driver  = new ChromeDriver();
	 //how to maximize window 
		driver.manage().window().maximize();
		
		System.out.println("Chrome is open");
		
		//stop execution for 2sec
		Thread.sleep(2000);
		
		//how to close chrome
		driver.close();
		System.out.println("chrome is close");
		
	}

}
