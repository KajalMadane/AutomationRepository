package dropdownmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import synchronization.Dropdown;

public class Singleselect {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//select=[text()='Dropdown']")).click();
	
	
//select Option

WebElement dropdown1=driver.findElement(By.xpath("//select[contains(@class='transition-all duration-150']"));
Select sel1 =new Select(dropdown1);
	Thread.sleep(2000);
	sel1.selectByIndex(3);
	
	//identify coutry  option
	 WebElement dropDown2 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
	Select sel2=new Select(dropDown2);
	  sel2.selectByValue("India");
	
	
	//state dropdown
	WebElement dropDown3=driver.findElement(By.xpath("\"//label[text()='State']/following-sibling::select\""));
	Select sel3=new Select(dropDown3);
	sel3.selectByVisibleText("Maharashtra");
	
	
	//handel multiselect
	Thread.sleep(2000);
	driver.navigate().to("http://demoapps.qspiders.com/dropdown/multiSelect");
	
	
	
	//identify dropdown
	WebElement  dropDown4=driver.findElement(By.id("iddd"));
	 Select sel4 = new Select(dropDown4);
	sel4.selectByIndex(5);
	
	
	//select multiple Options
	for(int i=0;i<=5;i++)
	{
		sel4.selectByIndex(i);
	}
	
	
	}
}
	