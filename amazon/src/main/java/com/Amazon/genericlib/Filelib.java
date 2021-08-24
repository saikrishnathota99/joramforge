package com.Amazon.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib {
	public String getpropData(String propPath,String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(propPath);
		Properties prop=new Properties();
		prop.load(fis);
		String propValue=prop.getProperty(key,"IncorrectKey");
		return propValue;
		
	}
	public String getcellData(String excelPath,String sheet,int row,int cell) throws Throwable{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb= WorkbookFactory.create(fis);
		String excelValue=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return excelValue;		
	}
	public void setcellData(String excelPath,String sheet,int row,int cell,String data) throws Throwable{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb= WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(excelPath);
		wb.write(fos);	
		
	}

	public int getRowCount(String excelPath,String sheet) throws Throwable{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb= WorkbookFactory.create(fis);
		int rowCount =wb.getSheet(sheet).getLastRowNum();
		return rowCount;
	}
		
		
	}
	
	
	
	