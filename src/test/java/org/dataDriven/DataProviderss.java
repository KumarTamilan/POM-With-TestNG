package org.dataDriven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderss {
	static WebDriver driver;
	
	//10.How to Create the PropertyReaderClass in DataDriven ?
	//					SECOND WAYS :
	
	@BeforeClass
	public  void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://www.facebook.com/");
	}
	@Test(dataProvider="TestData")
	public void logInPage(String userName,String passWord) throws InterruptedException{
		WebElement username = driver.findElement(By.xpath("//input[starts-with(@id,'email')]"));
		username.sendKeys(userName);
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@id,'pass')]"));
		password.sendKeys(passWord);
		
		Thread.sleep(2000);
		username.clear();
		password.clear();
	}
	//@DataProvider(name="TestData")
//	public String[][] datas() {
//		PropertyReaderClass reader = new PropertyReaderClass(".\\src\\test\\resources\\ExcelSheets\\MultipleData.xlsx","Sheet1");
//		int findRow = reader.findRow();
//		int findCell = reader.findCell();
//		return reader.findValues(findRow, findCell);
	
}
















