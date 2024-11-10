package org.pom.testBase;

import org.pom.testUtilities.ExcelHelper;
import org.testng.annotations.DataProvider;

public class DataGenerator {

	@DataProvider(name="qaTestData")
	public String[][] qaData() {
		ExcelHelper excel = new ExcelHelper(Constants.getExcelPath(),Constants.getExcelSheetName2());
		int findRow = excel.findRow();
		int findCell = excel.findCell();
		return excel.findValues(findRow, findCell);
	}
	@DataProvider(name="qaTestData1")
	public String[][] qaData2() {
		ExcelHelper excel1 = new ExcelHelper(Constants.getExcelPath(),Constants.getExcelSheetName3());
		int findRow = excel1.findRow();
		int findCell = excel1.findCell();
		return excel1.findValues(findRow, findCell);
	}
	@DataProvider(name="qaTestData2")
	public String[][] qaData3() {
		ExcelHelper excel2 = new ExcelHelper(Constants.getExcelPath(),Constants.getExcelSheetName4());
		int findRow = excel2.findRow();
		int findCell = excel2.findCell();
		return excel2.findValues(findRow, findCell);
	}
	@DataProvider(name="qaTestData3")
	public String[][] qaData4() {
		ExcelHelper excel3 = new ExcelHelper(Constants.getExcelPath(),Constants.getExcelSheetName5());
		int findRow = excel3.findRow();
		int findCell = excel3.findCell();
		return excel3.findValues(findRow, findCell);
	}
	@DataProvider(name="qaTestData4")
	public String[][] qaData5() {
		ExcelHelper excel4 = new ExcelHelper(Constants.getExcelPath(),Constants.getExcelSheetName6());
		int findRow = excel4.findRow();
		int findCell = excel4.findCell();
		return excel4.findValues(findRow, findCell);
	}
	@DataProvider(name="qaTestData5")
	public String[][] qaData6() {
		ExcelHelper excel5 = new ExcelHelper(Constants.getExcelPath(),Constants.getExcelSheetName7());
		int findRow = excel5.findRow();
		int findCell = excel5.findCell();
		return excel5.findValues(findRow, findCell);
	}
	@DataProvider(name="qaTestData6")
	public String[][] qaData7() {
		ExcelHelper excel6 = new ExcelHelper(Constants.getExcelPath(),Constants.getExcelSheetName8());
		int findRow = excel6.findRow();
		int findCell = excel6.findCell();
		return excel6.findValues(findRow, findCell);
	}
	@DataProvider(name="qaTestData7")
	public String[][] qaData8() {
		ExcelHelper excel7 = new ExcelHelper(Constants.getExcelPath(),Constants.getExcelSheetName9());
		int findRow = excel7.findRow();
		int findCell = excel7.findCell();
		return excel7.findValues(findRow, findCell);
	}
	@DataProvider(name="qaTestData8")
	public String[][] qaData9() {
		ExcelHelper excel8 = new ExcelHelper(Constants.getExcelPath(),Constants.getExcelSheetName10());
		int findRow = excel8.findRow();
		int findCell = excel8.findCell();
		return excel8.findValues(findRow, findCell);
	}
	@DataProvider(name="qaTestData9")
	public String[][] qaData10() {
		ExcelHelper excel9 = new ExcelHelper(Constants.getExcelPath(),Constants.getExcelSheetName11());
		int findRow = excel9.findRow();
		int findCell = excel9.findCell();
		return excel9.findValues(findRow, findCell);
	}
	
}
