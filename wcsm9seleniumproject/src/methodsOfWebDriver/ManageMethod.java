package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
	public static  void main(String[] args) throws InterruptedException {
		        //launch the chrome browser
				WebDriver driver=new ChromeDriver();

				//maximize the browser
			    driver.manage().window().maximize();
			    
			  //minimize the browser
			    driver.manage().window().minimize();
			    
			  //fullscreen the browser
			    driver.manage().window().fullscreen();
			    
			    //size of the browser
			    Dimension targetsize = new Dimension(350, 450);
			    driver.manage().window().setSize(targetsize);
			    
			    //set the position of browser
			    Point targetPosition  = new Point (450,250);
			    driver.manage().window().setPosition(targetPosition);
			    
				//stop the execution for 2 sec
				Thread.sleep(2000);
				//close the browser
				driver.close();
				
		
	} 

}
