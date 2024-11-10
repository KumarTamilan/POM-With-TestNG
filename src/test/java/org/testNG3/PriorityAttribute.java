package org.testNG3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PriorityAttribute {
	
	//5.What is PRIORITY ? How to perform ?
	
	public WebDriver driver;

	@BeforeClass
	public void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.facebook.com/");
	}

	@Test(priority = -5)
	public void usernameField() {
		WebElement username = driver.findElement(By.xpath("//input[starts-with(@id,'email')]"));
		username.sendKeys("kumaran");
	}

	@Test(priority = -4)
	public void passwordField() {
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@id,'pass')]"));
		password.sendKeys("Kumaran@Test");
	}

	@Test(priority = -3)
	public void createNewAccountField() {
		WebElement createNewAccountClick = driver.findElement(By.xpath("//a[contains(text(),'Create n')]"));
		createNewAccountClick.click();
	}

	@Test(priority = -2)
	public void firstName() {
		WebElement firstNameField = driver.findElement(By.xpath("//input[starts-with(@name,'firstname')]"));
		firstNameField.sendKeys("Kumaran");
	}

	@AfterClass
	public void driverClose() {
		driver.close();
	}
}