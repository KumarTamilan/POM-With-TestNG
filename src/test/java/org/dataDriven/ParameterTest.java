package org.dataDriven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterTest {
	//8.How to pass the Data from Parameters to WebPage ?How many ways ?
	//									TWO WAYS : 
	//	1.Create the single Test in testng.xml file then,To pass name & Data in the parameter.
	//	2.Create the multiple test in testng.xml file then,To pass name & Data in the parameter.
	public WebDriver driver;

	@BeforeClass
	public  void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://www.facebook.com/");
	}
	
	@Parameters({"username1","password1"})
	@Test
	public void logInPage(String userName,String passWord) {
		WebElement username = driver.findElement(By.xpath("//input[starts-with(@id,'email')]"));
		username.sendKeys(userName);
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@id,'pass')]"));
		password.sendKeys(passWord);
		driver.close();
	}
}
