package org.testNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodLevelParallelTest {
public  WebDriver driver;
	
	//25.What is PARALLEL TEST ?
	// 	 -How to find the CurrentThreadName OR CurrentThreadId ?

	@Test
	public void logInPage()  {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.automationtesting.in/Frames.html");
		System.out.println(Thread.currentThread().getName());
	}
	@Test
	public void logInPage2()  {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth\r\n"); 
		System.out.println(Thread.currentThread().getName());
	}
	@Test
	public void logInPage3()  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		System.out.println(Thread.currentThread().getName());
		
	}
	
	
}
