package org.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlwaysRunAttribute {

public static WebDriver driver;
	
	//8.How to perform alwaysRun() ?

	@BeforeClass(alwaysRun=true)
	public void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
	}
	@Test(priority= -5)
	//FAILED
	public void userName() {
		WebElement username = driver.findElement(By.xpath("//inpt[starts-with(@id,'email')]"));
		username.sendKeys("kumaran123@gmail.com");
	}
	@Test(priority=-4,alwaysRun=true )
	//PASSED
	public void passWord() {
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@id,'pass')]"));
		password.sendKeys("Kumaran123");
	}
	@Test(priority= -3)
	//PASSED
	public void createNewAccountClick() {
		WebElement createNewAccountClick = driver.findElement(By.xpath("//a[contains(text(),'Create n')]"));
		createNewAccountClick.click();
	}
	@Test(priority=-2)
	//FAILED
	public void firstName() {
		WebElement firstNameField = driver.findElement(By.xpath("//inpt[starts-with(@name,'firstname')]"));
		firstNameField.sendKeys("Kumaran");
	}
	
	@Test(priority=-1,alwaysRun=true)
	//PASSED
	public void lastName() {
		WebElement lastNameField = driver.findElement(By.xpath("//input[starts-with(@name,'lastname')]"));
		lastNameField.sendKeys("Karuppannan");
	}

	@AfterClass
	public void driverClose() {
		driver.close();
	}
}
