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
		driver.get("\"file:///C:/Users/DELL/Desktop/wcsm9webelements/multidropdown.html\"");
		driver.findElement(By.xpath("//select=[text()='Dropdown']")).click();
		
	//driver.navigate().to("http://demoapps.qspiders.com/dropdown/multiSelect");
	
	//identify dropdown that is multiselect
	WebElement dropDown2 = driver.findElement(By.xpath(""));
   Select sel2 = new Select(dropDown2);
 
 
  WebElement dropDown3=driver.findElement(By.id("iddd"));
	 Select sel3=new Select(dropDown3);
	
	//select and deselect option
	Thread.sleep(2000);
	 sel2.selectByIndex(2);
	Thread.sleep(2000);
	sel2.selectByIndex(2);
	

	//multiple option
	for(int i=0;i<=4;i++)
	{
	Thread.sleep(2000);
	 sel2.selectByIndex(i);
	}
	Thread.sleep(2000);
	for(int i=0;i<=4;i++)
	{
	Thread.sleep(2000);
    sel2.selectByIndex(i);
	}
	
	
	//select and deselectby using value
	 sel2.selectByValue("V2");
	Thread.sleep(2000);
	 sel2.selectByValue("V2");
	Thread.sleep(2000);
	
	
	//selectand deselect by using visible text
	 sel2.selectByVisibleText("Misal");
	Thread.sleep(2000);
	 sel2.selectByVisibleText("Misal");
	Thread.sleep(2000);
	
	
	


	
	
}

}



