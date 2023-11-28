package popup;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Notificationpopup {
	private static FirefoxOptions driver;

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter browserValue!!");
		 String browserValue=sc.next();
		 
		 if(browserValue.equalsIgnoreCase("Chrome"))
		 {
		 ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			 driver =  new ChromeOptions();
		 }
			 else if(browserValue.equalsIgnoreCase("firefox"))
			 {
				  FirefoxOptions fo = new FirefoxOptions();
					fo.addArguments("--disable-notifications");
					 driver = new FirefoxOptions(fo);
			 }
			 else
			 {
				 
			 
			 System.out.println("Enter the browser value");
			 
				 ((WebDriver) driver).get("https://www.irctc.co.in/nget/");
				 
				 }
		 }
			 
			 
	}


