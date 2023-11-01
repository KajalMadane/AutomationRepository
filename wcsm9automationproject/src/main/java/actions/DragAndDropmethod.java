package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragAndDropmethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		 driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		 
		 //store all the drag element
		 
  WebElement src1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
  WebElement src2 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
  WebElement src3 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
  WebElement src4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
  
  //storeall the drop element
  WebElement target1 = driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100'])[1]"));
  WebElement target2 = driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100'])[2]"));
  WebElement target3 = driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100'])[3]"));
  WebElement target4 = driver.findElement(By.xpath("//div[@class='drop-column min-h-[200px] bg-slate-100'])[4]"));
  //perform drag and drop for mobile
  Actions act = new Actions(driver);
  Thread.sleep(2000);
  act.dragAndDrop(src1,target1).perform();
  Thread.sleep(2000);
  
  act.dragAndDrop(src2,target2).perform();
  Thread.sleep(2000);
  act.dragAndDrop(src3,target3).perform();
  Thread.sleep(2000);
  act.dragAndDrop(src4,target4).perform();


  
  
		

}
}