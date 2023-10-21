package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
	//to launch edge browser we need create obj of EdgeDriver();
		
		 WebDriver driver=new EdgeDriver();
		 //how to maximize window
		 driver.manage().window().maximize();
		System.out.println("Edge is open");
		//stop the execution of script for 4sec
		Thread.sleep(4000);
		//how to close Edge
		driver.close();
		System.out.println("Edge is close");
		
	}

}
