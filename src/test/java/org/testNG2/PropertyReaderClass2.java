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

public class PropertyReaderClass2 {
	File file;
	FileInputStream inputStream;
	Workbook wb;
	Sheet sheet;
	Row row;
	Cell cell;
	DataFormatter formatter;
	String[][] stringArray;
	int i, j;

	public PropertyReaderClass2(String filePath, String sheetName) {
		try {
			file = new File(filePath);
			inputStream = new FileInputStream(file);
			wb = new XSSFWorkbook(inputStream);
			sheet = wb.getSheet(sheetName);
		} catch (FileNotFoundException e) {
			System.out.println("Throw the FileNotFoundException");
		} catch (IOException e) {
			System.out.println("Throw the IOException");
		}
	}

	public String findValue(int rows, int cells) {
		row = sheet.getRow(rows);
		cell = row.getCell(cells);
		formatter = new DataFormatter();
		return stringArray[i][j] = formatter.formatCellValue(cell);

	}

	public String[][] findValues(int rowSize, int cellSize) {
		stringArray = new String[rowSize][cellSize];
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < cellSize; j++) {
				row = sheet.getRow(i);
				cell = row.getCell(j);
				formatter = new DataFormatter();
				stringArray[i][j] = formatter.formatCellValue(cell);
			}
		}
		return stringArray;

	}

	public int findRow() {
		return sheet.getPhysicalNumberOfRows();
	}

	public int findCell() {
		return sheet.getRow(0).getPhysicalNumberOfCells();
	}

}