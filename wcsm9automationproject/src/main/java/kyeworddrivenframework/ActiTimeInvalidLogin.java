package kyeworddrivenframework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ActiTimeInvalidLogin extends BaseTest{
	public static void main(String[] args) throws IOException, InterruptedException {
		//launch the browserand close the browser
		BaseTest bt=new BaseTest();
		//to read the data from excel file
		Flib flib=new Flib();
		bt.openBrowser();
		int rc =flib.rowCount("./src/main/resources/ActiTimeTestData.xlsx","invalidread");
		for(int i=1;i<=rc;i++)
		{
		//String InvalidUsn = flib.readDataFromExcel(EXCEL_PATH,"invalidread",i,0);
		//String InavlidPass=flib.readDataFromExcel(EXCEL_PATH,"invalidread",i,1);
		
		//identify username text box
		  WebElement usnTB = driver.findElement(By.name("username"));
		  usnTB.sendKeys(flib.readDataFromExcel(EXCEL_PATH,VALIDCREDS_SHEET, i, 0));
		  WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys(flib.readDataFromExcel(INVALIDCREDS_SHEET, EXCEL_PATH, i, 1));
		driver.findElement(By.id("LoginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		
	}
	//bt.closeBrowser();
	}
}
