package com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	Workbook workbook;
	Sheet sheet;
	
	public ExcelReader(String excelPath, String sheetName) {
		try {
		if(excelPath.endsWith(".xls")) {
	 workbook=new HSSFWorkbook(new FileInputStream(excelPath));
	 sheet=workbook.getSheet(sheetName);
		}else if(excelPath.endsWith(".xlsx")) {
			workbook=new XSSFWorkbook(new FileInputStream(excelPath));
			sheet=workbook.getSheet(sheetName);
		} else {
			System.out.println("File not found");
		}
	}catch (IOException e) {
		e.printStackTrace();
	}	
	}
	public Object[][] excelData(){
		Object[][] data= {};
	int rows=sheet.getLastRowNum();
	int cells=sheet.getRow(0).getLastCellNum();
		
	data=new Object[rows][cells];
	DataFormatter dataFormatter=new DataFormatter();
	
	for(int i=0;i<rows;i++) {
	Row	row=sheet.getRow(i+1);
	for(int j=0;j<cells;j++) {
	Cell cell=row.getCell(j);
 Object	value=dataFormatter.formatCellValue(cell);
 data[i][j]=value;
	}
	}
	return data;	
	}	
}
