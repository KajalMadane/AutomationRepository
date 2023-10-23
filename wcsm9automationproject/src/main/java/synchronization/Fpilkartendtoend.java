package synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fpilkartendtoend {
	public static void main(String[] args, Duration allprices) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicit WAIT
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		//Handel popup
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		//search box
		driver.findElement(By.name("q")).sendKeys("laptop");
		//search icon
		driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
		//brand and select the HP
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[@class='_3879cV'and text()='HP']")).click();
		//click on core i7processor 
		driver.findElement(By.xpath("/div[@class='_3879cV']")).click();
		//select operating system and windows11
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		driver.findElement(By.xpath("//div[text()=Windows 11")).click();
		Thread.sleep(2000);
		//coustmer raitings
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		//nameWebElementes of laptops
         List<WebElement> allLaptops = driver.findElements(By.xpath("")).click();
           for (int i=0;i<allLaptops.size();i++)
           {
	     String laptop = allLaptops.get(i).getText();
	      Thread.sleep(2000);
	        System.out.println(laptop);
           }
           for(int j=i;j<=i;j++)
           {
        
			
			String price=allprices.get(j).getText();
           Thread.sleep(2000);
           System.out.println(allLaptops":"+price);
           
           
           }
		
		
		

	}

	

}
