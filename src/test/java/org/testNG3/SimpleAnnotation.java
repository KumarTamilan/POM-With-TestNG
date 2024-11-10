package org.testNG3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleAnnotation{
	
	//4.What is @TEST ? How to perform ?Code ?
	
	@Test
	public void logInField(){
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	driver.get("https://www.facebook.com/");
	
	WebElement username = driver.findElement(By.xpath("//input[starts-with(@id,'email')]"));
	username.sendKeys("kumaran");
	WebElement password = driver.findElement(By.xpath("//input[starts-with(@id,'pass')]"));
	password.sendKeys("Kumaran@Test");

	driver.close();
}
}




