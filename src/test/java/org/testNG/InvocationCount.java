package org.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InvocationCount {
	public  WebDriver driver;
	
	//20.What is INVOCATION COUNT ?How to perform ?
   // If we are giving INVOCATIONCOUNT =0 [OR] -10 Then What Happen ?
	//		If we are giving INVOCATIONCOUNT =0 [OR] -10 Then the 
	//		INVOCATIONCOUNT Test not execute.
	@BeforeClass
	public void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
	}
	@Test(invocationCount = 2)
	public void logInField() throws InterruptedException{
		WebElement username = driver.findElement(By.xpath("//input[starts-with(@id,'email')]"));
		username.sendKeys("kumaran123@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@id,'pass')]"));
		password.sendKeys("Kumaran123");
		
		Thread.sleep(1000);
		username.clear();
		password.clear();
	}
	
}
