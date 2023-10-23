package dropdownmethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/DELL/Desktop/wcsm9webelements/multidropdown.html");
		
		//single select dropdown
		WebElement menuDropdown1 = driver.findElement(By.id("iddd"));
		
		//handel dropdown
		Select  sel = new Select(menuDropdown1);
		
		//get all the options from dropdown by using getwrappedelement
		WebElement allops = sel.getWrappedElement();
		
		System.out.println(allops.getText());
		
		//get alltheoptins from dropdown by using getoptions
		List<WebElement> options = sel.getOptions();
		for(WebElement opt:options)
		{
			Thread.sleep(2000);
			System.out.println(opt.getText());
		}
		
		
		
	
		
		//select the option from dropdown without using selection method
		for(WebElement opt:options)
		{
			Thread.sleep(2000);
			if(opt.getText().equals("vadapav"))
			{
				opt.click();
				break;
			}
		}
			}
		


}

