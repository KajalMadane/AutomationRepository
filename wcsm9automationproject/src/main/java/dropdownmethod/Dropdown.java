package dropdownmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
  WebElement dropdown = driver.findElement(By.xpath("/select[@class='border-0 px-3 py-3 placeholder-blueGray-300 textl duration-150 w-5/12']"));
		 Select sel = new Select(dropdown);
          sel.selectByIndex(2);

          
}
}


