package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigetMethod {
	public static void main(String[] args) throws InterruptedException {
	     //launch the chrome browser
			WebDriver driver=new ChromeDriver();
		    //maximize the browser
		   driver.manage().window().maximize();
		   //launch the web application by using navigation()
		   Navigation nav = driver.navigate();
		   nav.to("https://www.selenium.dev");
		   Thread.sleep(2000);
		   
		   //toperform backword operation
		   nav.back();
		   Thread.sleep(2000);
		   
		 //toperform forword operation
		   nav.forward();
		   Thread.sleep(2000);
		   
		  //toperform refresh operation
		   nav.refresh();
		   Thread.sleep(2000);
	}
	
	
}
		   
		   
		   


