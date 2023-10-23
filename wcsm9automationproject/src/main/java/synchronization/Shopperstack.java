package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shopperstack {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/");
		
		driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4']")).click();
		
		driver.findElement(By.id("Check SAMSUNG Galaxy Z Flip4 Delivery")).sendKeys("411033");
		//expicit wait
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.id("Che")));
		ele.click();
		
	}

}
