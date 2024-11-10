package org.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutors {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://developers.facebook.com/?ref=pf");
		
		//1.How to perform scrollIntoView Using JavascriptExecutor ?

		WebElement scrollIntoView = driver.findElement(By.xpath("//span[text()='Why build with us?']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",scrollIntoView);
		
		//2.How to perform scrollIntoPage Top Using JavascriptExecutor ?
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		
		//3.How to perform scrollIntoPage Bottom Using JavascriptExecutor ?
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight);");
		
		//4.How to perform scrollDown Using JavascriptExecutor ?

		js.executeScript("window.scrollBy(0,600);");
		
		//5.How to perform scrollUp Using JavascriptExecutor ?

		js.executeScript("window.scrollBy(0,-600);");
		
		//6.How to perform Click Using JavascriptExecutor ?
		
		WebElement click = driver.findElement(By.xpath("//div[@class='_api1 _ar04']"));
		js.executeScript("arguments[0].click();",click);
		
		//7.How to perform sendKeys Using JavascriptExecutor ?
		
		WebElement sendKeys = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		js.executeScript("arguments[0].value='Kumaran'",sendKeys);
		
		//8.How to perform refresh the Browser Using JavascriptExecutor ?
		js.executeScript("history.go(0);");
		
	}
}
