package org.pom.testUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {

	File file;
	FileInputStream inputStream;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	XSSFWorkbook wb;
	DataFormatter format;
	String[][] stringArray;
	int i,j;

	public ExcelHelper(String filePath,String sheetName){
		try{
		file = new File(filePath);
		inputStream = new FileInputStream(file);
		wb = new XSSFWorkbook(inputStream);
		sheet = wb.getSheet(sheetName);	
		}
		catch(FileNotFoundException e){
			e.getMessage();
		}
		catch(IOException e){
			e.getMessage();
		}
}
	public String findValue(int rowIndex,int cellIndex){
		row = sheet.getRow(rowIndex);
		cell = row.getCell(cellIndex);
		format = new DataFormatter();
		return format.formatCellValue(cell);
}
	public int findRow(){
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		return physicalNumberOfRows;
}
	public int findCell(){
		int physicalNumberOfCells = sheet.getRow(0).getPhysicalNumberOfCells();
		return physicalNumberOfCells;
}
	public String[][] findValues(int physicalNumberOfRows,int physicalNumberOfCells){
		stringArray = new String[physicalNumberOfRows][physicalNumberOfCells];

		for(int i=0; i<physicalNumberOfRows; i++){
			for(int j=0; j<physicalNumberOfCells; j++){
				row = sheet.getRow(i);
				cell = row.getCell(j);
				format = new DataFormatter();
				stringArray[i][j] = format.formatCellValue(cell);          }}
		return stringArray;
}
}
