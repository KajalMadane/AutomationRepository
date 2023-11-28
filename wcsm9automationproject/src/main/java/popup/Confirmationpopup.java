package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmationpopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//section[text()='Popups']")).click();
		 
		 driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		 driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		 Thread.sleep(2000);
		Alert confirm = driver.switchTo().alert();
		//accept popup
		
		//confirm.accept();
		String textofconfirm= confirm.getText();
		System.out.println(textofconfirm);
		
		   //Thread.sleep(2000);
		        //dismiss 
				//confirm.dismiss();
				Thread.sleep(2000);
				//gettext
				//confirm.getText();
				
				
		
	}

}
