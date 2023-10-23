package webelementmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_GetSize_GetRect {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/");
		 WebElement emailTextBox = driver.findElement(By.cssSelector("input#email"));
		 //location
		Point loc=emailTextBox.getLocation();
		int xaxis=loc.getX();
		int yaxis=loc.getY();
		System.out.println("location of email text box:"+xaxis+":" +yaxis);
		//dimension
	 Dimension size = emailTextBox.getSize(); 
	int height = size.getHeight()	;
	int width = size.getWidth();
	System.out.println("size of email text box:"+height+":"+width);
	//rect
	 Rectangle rect = emailTextBox.getRect();
	 System.out.println(rect.getX()+":"+rect.getY());
	 System.out.println(height+":"+width);
	 	
	 		

	
	 
	 
	 
	
	
	
	
	}

}
