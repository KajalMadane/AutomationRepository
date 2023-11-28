package pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.By;

import kyeworddrivenframework.BaseTest;
import kyeworddrivenframework.Flib;

public class ActiTimeValidlogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		 
		//launch the browser 
		BaseTest bt=new BaseTest();
		bt.setUp();
		//get webelement from login page pom class
		LoginPage lp = new LoginPage(driver);
		//read data from login page pom class
		Flib flib = new Flib();
		lp.ValidLogin(flib.readDataFromProperty(prop_path, "username"),flib.readDataFromProperty(prop_path, "password"));
		
		bt.tearDown();
		////driver.findElement(By.name("username")).sendKeys(flib.readDataFromProperty("./src/main/resources/config.properties","username"));
		//driver.findElement(By.name("pwd")).sendKeys(flib.readDataFromProperty("./src/main/resources/config.properties","pwd" ));
		// for Iautoconstatnt
		//WebElement usnTB = driver.findElement(By.name("username"));
		//usnTB.sendKeys(flib.readDataFromProperty(prop_path,"usrname"));
		//WebElement passTB = driver.findElement(By.name("pwd"));
		//passTB.sendKeys(flib.readDataFromProperty(prop_path,"Password"));
	////driver.findElement(By.id("loginButton")).click();
      
		//Thread.sleep(2000);
       // bt.closeBrowser();
}
}
