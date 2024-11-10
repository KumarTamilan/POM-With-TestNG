package org.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest2{
	public WebDriver driver;
																																																																																																																																																																																																																																																																																																																																																																																							
	@BeforeClass
	public void browserLaunch(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.facebook.com/");
	}
	@Test(dataProvider="TestData")
	public void logInField(String userName,String passWord) throws InterruptedException{
		WebElement username = driver.findElement(By.xpath("//input[starts-with(@id,'email')]"));
		username.sendKeys(userName);
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@id,'pass')]"));
		password.sendKeys(passWord);
		Thread.sleep(1000);
		username.clear();
		password.clear();
	}
	@AfterClass
	public void driverClose(){
		driver.close();
	}
	@DataProvider(name="TestData")
	public Object[][] qaData(){
		PropertyReaderClass excel = new PropertyReaderClass(".\\src\\test\\resources\\ExcelSheets\\MultipleData.xlsx","Sheet1");
		int rowSize = excel.findRow();
		int cellSize = excel.findCell();
		return excel.findValues(rowSize,cellSize);
			}
}

