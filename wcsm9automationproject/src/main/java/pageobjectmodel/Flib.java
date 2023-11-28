package pageobjectmodel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	public String readDataFromExcel(String excelpath,String sheetName,int rowCount,int cellCount) throws IOException
	{
		
		FileInputStream fis = new FileInputStream(excelpath);
		  
		  Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet(sheetName);
		 Row row = sheet.getRow(rowCount);
		 Cell cell = row.getCell(cellCount);
		 String data=null;
		 
		 cell.getCellType();
		if(cell.getCellType()==CellType.STRING)
		 {
			 data=cell.getStringCellValue();
		 } else {
			cell.getCellType();
			if(cell.getCellType()==CellType.NUMERIC)
			 {
				 cell.getStringCellValue();
				data=String.valueOf(cell.getNumericCellValue());
			 }
		}
		 return data;
}
	public void writeDataToExcel(String excelpath,String sheetName,int rowCount,int cellCount,String data) throws IOException 
	{
		
			FileInputStream fis = new FileInputStream(sheetName);
			 Workbook wb = WorkbookFactory.create(fis);
			 Sheet sheet = wb.getSheet(sheetName);
			 Row row = sheet.getRow(rowCount);
			 Cell cell = row.getCell(cellCount);
			 
			cell.setCellValue(data);
			 
			 FileOutputStream fos = new FileOutputStream(excelpath);
			 wb.write(fos);
		}
	
	public int rowCount(String excelpath,String sheetName) throws IOException 
	{
		FileInputStream fis = new FileInputStream(excelpath);
		  Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet(sheetName);
		int rc=sheet.getLastRowNum();
	    return rc;
	}
	public String readDataFromProperty(String propPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop=new Properties();
		prop.load(fis);
		String data=prop.getProperty(key);
		return data;
		
	}

	}


