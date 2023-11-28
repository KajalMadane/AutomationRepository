package pageobjectmodel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import kyeworddrivenframework.Flib;
import kyeworddrivenframework.IautoConstant;

public class BaseTest extends Flib implements IautoConstant {
	static WebDriver driver;
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		
		String browserValue = flib.readDataFromProperty("./src/main/resources/ActiTimeTestData.xlsx","Browser");
		String url=flib.readDataFromProperty("./src/main/resources/ActiTimeTestData.xlsx" ,"url");
		
		//for Iautoconstsnt
		//String browserValue = flib.readDataFromProperty(prop_path,"Browser");
		//String url=flib.readDataFromProperty(prop_path ,"url");
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			
			driver=new ChromeDriver();
		}
		else if (browserValue.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();

		}
		
		else if (browserValue.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("Browser value is invalid!!!");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		
	}
	public void closeBrowser()
	{
		driver.quit();
	}
}


