package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MyReadFileDemoClass {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream fileInputStream=new FileInputStream("sample.xlsx");
			
			Workbook workbook=null;
			
			workbook=new XSSFWorkbook(fileInputStream);
		
			int noOfSheets=workbook.getNumberOfSheets();
			for(int i=0;i<noOfSheets;i++) {
				Sheet sheet=workbook.getSheetAt(i);
				
				Iterator<Row> rowIterator=sheet.iterator();
				while(rowIterator.hasNext()) {
					Row row=rowIterator.next();
					
					Iterator<Cell> cellIterator=row.cellIterator();
					while(cellIterator.hasNext()) {
						Cell cell=cellIterator.next();
						switch(cell.getCellType()) {
						case NUMERIC:
							System.out.println(cell.getNumericCellValue());
							break;
						case STRING:
							System.out.println(cell.getStringCellValue());
						}
						
					}
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
