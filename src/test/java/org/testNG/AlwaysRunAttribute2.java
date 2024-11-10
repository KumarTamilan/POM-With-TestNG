package org.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlwaysRunAttribute2 {

public static WebDriver driver;
	
	//9.If we are give enabled=false,ALWAYSRUN=true So,What output ?

	@BeforeClass
	public void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
	}
	@Test(priority= -5)
	public void userName() {
		WebElement username = driver.findElement(By.xpath("//input[starts-with(@id,'email')]"));
		username.sendKeys("kumaran123@gmail.com");
		
	}
	@Test(priority=-4,enabled=false,alwaysRun=true )
	public void passWord() {
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@id,'pass')]"));
		password.sendKeys("Kumaran123");
	}
	@Test(priority= -3)
	public void createNewAccountClick() {
		WebElement createNewAccountClick = driver.findElement(By.xpath("//a[contains(text(),'Create n')]"));
		createNewAccountClick.click();
	}
	@AfterClass
	public void driverClose() {
		driver.close();
	}
}