package pageobjectmodel;



import java.io.IOException;

import kyeworddrivenframework.BaseTest;
import kyeworddrivenframework.Flib;

public class ActiTimeInvalid extends BaseTest {




	public static void main(String[] args) throws IOException {
		 
		//launch the browser 
		BaseTest bt=new BaseTest();
		bt.setUp();
		//get webelement from login page pom class
		LoginPage lp = new LoginPage(driver);
		//read data from login page pom class
		Flib flib = new Flib();
		int rc =flib.rowCount(EXCEL_PATH,INVALIDCREDS_SHEET);
		 for (int i=1;i<=rc;i++)
		 {
			 lp.InvalidLogin(flib.readDataFromExcel(INVALIDCREDS_SHEET, INVALIDCREDS_SHEET,i,0),flib.readDataFromExcel(INVALIDCREDS_SHEET, EXCEL_PATH, rc, i));
		 }
		 bt.tearDown();
	}
}