package org.testNG2;

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

public class PropertyReaderClass1{
	File file;
	FileInputStream inputStream;
	Workbook wb;
	Sheet sheet;
	Row row;
	Cell cell;
	DataFormatter formatter;
	String[][] stringArray;
	int i,j;

	public String[][] getData(String filePath,String sheetName){
		try{
			file = new File(filePath);
			inputStream = new FileInputStream(file);
			wb = new XSSFWorkbook(inputStream);
			sheet = wb.getSheet(sheetName);
			}catch(FileNotFoundException e){
				System.out.println("Throw the FileNotFoundException");
			}catch(IOException e){
				System.out.println("Throw the IOException");
			}
			int rowSize = sheet.getPhysicalNumberOfRows();
			int cellsize = sheet.getRow(i).getPhysicalNumberOfCells();
			stringArray = new String[rowSize][cellsize];
			for(int i=0; i<rowSize; i++){
				for(int j=0; j<cellsize; j++){
					row = sheet.getRow(i);
					cell = row.getCell(j);
					formatter = new DataFormatter();
					stringArray[i][j] = formatter.formatCellValue(cell);
			}
			}
			return stringArray;
	}
		
}
