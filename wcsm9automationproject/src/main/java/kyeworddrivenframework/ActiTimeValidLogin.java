package kyeworddrivenframework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeValidLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		 
		//launch the browser 
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		Flib flib=new Flib();
		//driver.findElement(By.name("username")).sendKeys(flib.readDataFromProperty("./src/main/resources/config.properties","username"));
		//driver.findElement(By.name("pwd")).sendKeys(flib.readDataFromProperty("./src/main/resources/config.properties","pwd" ));
		// for Iautoconstatnt
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys(flib.readDataFromProperty(prop_path,"usrname"));
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys(flib.readDataFromProperty(prop_path,"Password"));
	driver.findElement(By.id("loginButton")).click();
      Thread.sleep(2000);
        bt.closeBrowser();
}
}

