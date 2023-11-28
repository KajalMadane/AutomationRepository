package dataDrivenFreameWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kyeworddrivenframework.Flib;

public class ValidLoginTestCase {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://kajal/login.do");
		 Thread.sleep(2000);
		 Flib flib=new Flib();
		 String usnData=flib.readExcelData("./src/main/resources/ActiTimeTestData.xlsx","validcreds",1,0);
		 String pwdData=flib.readExcelData("./src/main/resources/ActiTimeTestData.alsx","validcreds",1,1);
		 driver.findElement(By.name("username")).sendKeys(usnData);
		 Thread.sleep(2000);
		 driver.findElement(By.name("pwd")).sendKeys(usnData);

		 Thread.sleep(2000);
		 driver.findElement(By.id("loginButton")).click();

}
}
