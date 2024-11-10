package org.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Screenshot{
	static File file;
	static FileInputStream inputStream;
	static Workbook wb;
	static Sheet sheet;
	static Row row;
	static Cell cell;
	static DataFormatter formatter;
	
	public static void main(String[] args){
		try{
		file = new File(".\\src\\test\\resources\\ExcelSheets\\Datadriven.xlsx");
		inputStream = new FileInputStream(file);
		wb = new XSSFWorkbook(inputStream);
		}catch(FileNotFoundException e){
			System.out.println("Throw the FileNotFoundException");
		}catch(IOException e){
			System.out.println("Throw the IOException");
		}
		sheet = wb.getSheet("Sheet1");
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		for(int i=0; i<physicalNumberOfRows; i++){
			int physicalNumberOfCells = sheet.getRow(i).getPhysicalNumberOfCells();
			for(int j=0; j<physicalNumberOfCells; j++){
				row = sheet.getRow(i);
				cell = row.getCell(j);
				formatter = new DataFormatter();
				String value = formatter.formatCellValue(cell);
				System.out.println(value);
		}
		}
}
}
