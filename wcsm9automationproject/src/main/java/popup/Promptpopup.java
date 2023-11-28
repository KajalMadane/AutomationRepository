package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promptpopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//section[text()='Popups']")).click();
		 
		 driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		 driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		 Thread.sleep(2000);
		Alert propmpt = driver.switchTo().alert();
		//accept popup
		Thread.sleep(2000);
		propmpt.accept();
		String textofprompt = propmpt.getText();
		System.out.println(textofprompt);
		
	}

}



