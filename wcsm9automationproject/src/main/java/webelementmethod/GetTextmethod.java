package webelementmethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextmethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicit WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("iphone");
		 List<WebElement> alliphone = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		Thread.sleep(2000);
		for(WebElement phone : alliphone)
		
		{
			System.out.println(((WebElement) alliphone).getText());
			
		}
		
}
}
