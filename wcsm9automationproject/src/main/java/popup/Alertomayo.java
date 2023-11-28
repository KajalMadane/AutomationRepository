package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertomayo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='alert1']")).click();
		 
		 Thread.sleep(2000);
			Alert al = driver.switchTo().alert();
			//accept popup
			Thread.sleep(2000);
			al.accept();
			String textofalert = al.getText();
			System.out.println(textofalert);
			


		
	}

}
