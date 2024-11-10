package org.selenium;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts {

	public static void main(String[] args) throws InterruptedException,AWTException   {
		//5.How to handle the permission based popup ? 
		// USING CHROMEOPTIONS : 
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Permission based popup successfully handled.");
		
		//4.How to handle the Authentication Popup ?
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth\r\n");            
		
		System.out.println("Authentication popup successfully Authenticated.");
			
		

			driver.close();
	}
}





