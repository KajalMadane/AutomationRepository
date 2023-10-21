package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocater {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	}

}
