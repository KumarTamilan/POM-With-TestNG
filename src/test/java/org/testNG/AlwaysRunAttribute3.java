package org.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlwaysRunAttribute3 {

public static WebDriver driver;
	
	//10.In TestNG dependsOnMethod is failed then alwaysRun Method what happen ?
	//11.How to perform DependsOnMethod ?

	@BeforeClass
	public void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
	}
	
	//THIS METHOD IS FAILED
	@Test
	public void userName() {
		WebElement username = driver.findElement(By.xpath("//inpt[starts-with(@id,'email')]"));
		username.sendKeys("kumaran123@gmail.com");
	}
	@Test(alwaysRun=true,dependsOnMethods="userName" )
	public void passWord() {
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@id,'pass')]"));
		password.sendKeys("Kumaran123");
	}
	
	@Test(dependsOnMethods="passWord")
	public void createNewAccountClick() {
		WebElement createNewAccountClick = driver.findElement(By.xpath("//a[contains(text(),'Create n')]"));
		createNewAccountClick.click();
	}
	@Test(dependsOnMethods="createNewAccountClick" )
	
	//THIS METHOD ALSO FAILED BUT NEXT ALWAYSRUN TEST METHOD WILL BE PASSED
	public void firstName() {
		WebElement firstNameField = driver.findElement(By.xpath("//inpt[starts-with(@name,'firstname')]"));
		firstNameField.sendKeys("Kumaran");
	}
	@Test(dependsOnMethods="firstName",alwaysRun=true)
	public void lastName() {
		WebElement lastNameField = driver.findElement(By.xpath("//input[starts-with(@name,'lastname')]"));
		lastNameField.sendKeys("Karuppannan");
	}
	@AfterClass
	public void driverClose() {
		driver.close();
	}
}
