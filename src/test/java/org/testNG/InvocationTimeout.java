package org.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class InvocationTimeout {
	public  WebDriver driver;
	
	//21.What is INVOCATION TIMEOUT ?How to perform ?

	@Test(priority= -5)
	public void urlLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
	}
	@Test(priority= -4,timeOut = 1000)
	public void logInField() {
		WebElement username = driver.findElement(By.xpath("//input[starts-with(@id,'email')]"));
		username.sendKeys("kumaran123@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@id,'pass')]"));
		password.sendKeys("Kumaran123");
		WebElement createNewAccountClick = driver.findElement(By.xpath("//a[contains(text(),'Create n')]"));
		createNewAccountClick.click();
		WebElement firstNameField = driver.findElement(By.xpath("//input[starts-with(@name,'firstname')]"));
		firstNameField.sendKeys("Kumaran");
	}
	@AfterClass(alwaysRun=true)
	public void driverClose() {
		driver.close();
	}
}
