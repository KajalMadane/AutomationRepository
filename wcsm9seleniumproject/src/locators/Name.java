package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DELL/Desktop/wcsm9webelements/radiobutton.html");
		Thread.sleep(2000);
		//identify D radio button by using name LOcator
		driver.findElement(By.name("name4")).click();
		//identify A radio button by using name locater
		Thread.sleep(2000);
		driver.findElement(By.name("name1")).click();
		Thread.sleep(2000);


}
}
