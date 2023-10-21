package methodsOfWebDriver;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetwindowHandels {
	public static void main(String[] args, String[] allHandels) throws InterruptedException {
		//open the browser
		WebDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//launch the webapplication
		driver.get("http://omayo.blogspot.com/");
		//address of the current window and browser
		//parent browser
		String parentHandle = driver.getWindowHandle();
		System.out.println("Address of parent browser or window"+parentHandle);
		Thread.sleep(2000);
		//click on open popup window
		driver.findElement(By.partialLinkText("opena popup window")).click();
		//get add parent as well as child window
		Set<String>allHandles = driver.getWindowHandles();
	
		//print the address of browser use for loop
		for (String wh:allHandels)
		{
			if(!parentHandle.equals(wh))
				
			{
				System.out.println("Address of child window: "+wh);
			}
			else
			{
				System.out.println("Address of parent window:"+wh);
			}
				
		}
		}
			

}


