package dropdownmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//select=[text()='Dropdown']")).click();
		
	driver.navigate().to("http://demoapps.qspiders.com/dropdown/multiSelect");
	
	//desele
	ction onmultiselect
	driver.findElement(By.partialLinkText("Multi Select")).click();
	
	
	//identify dropdown that is multiselect
	dropDown2=driver.findElement(By.xpath(""));
   sel2=new Select(dropDown2);
 
 
  WebElement dropDown4=driver.findElement(By.id("iddd"));
	 Select sel2=new Select(dropDown2);
	
	//select and deselect option
	Thread.sleep(2000);
	Select sel2.selectByIndex(2)
	Thread.sleep(2000);
	Select sel2.selectByIndex(2);
	

	//multiple option
	for(int i=0;i<=4;i++)
	{
	Thread.sleep(2000);
	Select sel2.selectByIndex(i);
	}
	Thread.sleep(2000);
	for(int i=0;i<=4;i++)
	{
	Thread.sleep(2000);
	Select sel2.selectByIndex(i);
	}
	
	
	//select and deselectby using value
	Select sel2.selectByValue("V2");
	Thread.sleep(2000);
	Select sel2.selectByValue("V2");
	Thread.sleep(2000);
	
	
	//selectand deselect by using visible text
	Select sel2.selectByVisibleText("Misal");
	Thread.sleep(2000);
	Select sel2.selectByVisibleText("Misal");
	Thread.sleep(2000);
	
	
	


	
	
}
	

}


}
