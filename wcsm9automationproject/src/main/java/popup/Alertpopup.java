package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//section[text()='Popups']")).click();
		 
		 driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		 driver.findElement(By.xpath("//a[text()='Default Alert']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		 Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		//accept popup
		Thread.sleep(2000);
		alert.accept();
		String textofalert = alert.getText();
		System.out.println(textofalert);
		
		//dismiss 
		//alert.dismiss();
		
		//gettext
		//alert.getText();
		
		
	}
}
