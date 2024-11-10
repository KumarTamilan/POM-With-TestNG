package org.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

		// 1.How to get the headers from WebTable ?

		List<WebElement> tableHeader = driver.findElements(By.xpath("//table[starts-with(@class,'dataTable')]//th"));
		for (WebElement header : tableHeader) {
			System.out.println(header.getText());
		}

//		// 2.How to get the Total number of column size from WebTable ?
//
//		System.out.println("TOTAL COLUMN COUNT : " + tableHeader.size());
//
//		// 3.How to get the particular Data from WebTable ?
//
//		System.out.println("PARTICULAR DATA : ");
//		List<WebElement> particularData = driver
//				.findElements(By.xpath("//table[starts-with(@class,'dataTable')]//tbody//tr//td"));
//		for (WebElement data : particularData) {
//			if (data.getText().contains("Zomato")) {
//				System.out.println(data.getText());
//			}
//		}

		// 4.How to get the All Data from the WebTable ?

//		System.out.println("ALL DATA");
//		List<WebElement> allData = driver
//				.findElements(By.xpath("//table[starts-with(@class,'dataTable')]//tbody//tr//td"));
//		for (WebElement data : allData) {
//			System.out.print(data.getText());
//		}
//		System.out.println();
//
		// 5.How to get the Total Data Count from WebTable ?

//		System.out.println("TOTAL DATA COUNT : " + allData.size());
//
//		// 6.How to get the particular Row Data from WebTable ?
//
//		System.out.println("PARTICULAR ROW : ");
//		List<WebElement> particularRow = driver
//				.findElements(By.xpath("//table[starts-with(@class,'dataTable')]//tbody//tr[100]//td"));
//		for (WebElement row : particularRow) {
//			System.out.println(row.getText());
//		}
//
//		// 7.How to get the Total Row Count from WebTable ?
//
//		List<WebElement> rowSize = driver.findElements(By.xpath("//table[starts-with(@class,'dataTable')]//tbody//tr"));
//		System.out.println("TOTAL ROW COUNT : " + rowSize.size());
//
//		// 8.How to get the particular Column Data from WebTable
//		// If id & className not available ?
//
//		System.out.println("PARTICULAR COLUMN : ");
//		List<WebElement> particularColumn = driver
//				.findElements(By.xpath("//table[starts-with(@class,'dataTable')]//tbody//tr"));
//		for (WebElement allColumn : particularColumn) {
//			List<WebElement> column = allColumn.findElements(By.tagName("td"));
//			WebElement columnData = column.get(4);
//			System.out.print(columnData.getText());
//		}

		// 9.How to get the particular Column Data from WebTable
		// If className only available ?

//		List<WebElement> particularColumn2 = driver
//				.findElements(By.cssSelector("table.dataTable>tbody>tr>td:nth-child(2)"));
//		for (WebElement column2 : particularColumn2) {
//			System.out.println(column2.getText());
//		}
//
//		// 10.How to get the particular Column Data from WebTable
//		// If id only available ?
//
//		List<WebElement> particularColumn3 = driver.findElements(By.cssSelector("#table1>tbody>tr>td:nth-child(2)"));
//		for (WebElement column3 : particularColumn3) {
//			System.out.println(column3.getText());
//		}
		
		
	}
}
