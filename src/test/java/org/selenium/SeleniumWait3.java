package org.selenium;



import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SeleniumWait3 {

	
	
	public static void main(String[] args) throws InterruptedException,AWTException   {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		//1.How to write the IMPLICITWAIT ?
		//				WAIT IN SELENIUM 4 :
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//2.How to write the EXPLICITWAIT ? & METHODS ?

		WebElement aTag = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		System.out.println(aTag.getText());
		//Using visibilityOf(By locator) :
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Forgotten password?']"))));
		//Using visibilityOf(By element) :
		wait.until(ExpectedConditions.visibilityOf(aTag));
		//Using elementToBeClickable(By locator) :
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.
				xpath("//a[text()='Forgotten password?']"))));
		//Using elementToBeClickable(By element) :
		wait.until(ExpectedConditions.elementToBeClickable(aTag));
		//Using elementToBeSelected(By locator) :
		wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.
				xpath("//a[text()='Forgotten password?']"))));
		//Using elementToBeSelected(By element) :
		wait.until(ExpectedConditions.elementToBeSelected(aTag));
		//Using Alert is present : 
		wait.until(ExpectedConditions.alertIsPresent());
		//Using frameToBeAvailableAndSwitchToIt(By element OR Locator) : 
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(aTag));
		
		//3.How to write the FLUENTWAIT ?

		FluentWait waits = new FluentWait(driver);
		waits.withTimeout(Duration.ofSeconds(25));
		waits.pollingEvery(Duration.ofSeconds(5));
		waits.ignoring(NullPointerException.class);
		
		driver.close();
	}
}



