package dropdownmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/DELL/Desktop/wcsm9webelements/dropdown.html");
		
		//single select dropdown
		WebElement menuDropdown1 = driver.findElement(By.id("iddd"));
		
		//handel dropdown
		Select  sel = new Select(menuDropdown1);
		
		//select the option from dropdown
		Thread.sleep(2000);
		 sel.selectByValue("v6");
		Thread.sleep(2000);
		
		//get option which is selected first
		 WebElement firstoption =  sel.getFirstSelectedOption();
		 
		 System.out.println(firstoption.getText());
		 
		 
		 //multiop select option
		 driver.navigate().to("file:///C:/Users/DELL/Desktop/wcsm9webelements/multidropdown.html");
		 WebElement Dropdown2 = driver.findElement(By.id("iddd"));
		  Select sel2 = new Select(Dropdown2);
		  
		  
		  //select multiple options multiple drop
		  for(int i=0;i<8;i++)
		  {
			  Thread.sleep(2000);
			  sel2.selectByIndex(i);
			  
		  }
		  
		  //get option selected first
		  System.out.println(sel2.getFirstSelectedOption().getText());
		  
		  
		  
		 }
}
