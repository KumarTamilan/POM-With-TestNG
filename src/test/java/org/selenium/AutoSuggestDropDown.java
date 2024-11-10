package org.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://www.google.co.in/");
		
		//1.How to Handle Auto-Suggest DropDown ?

		WebElement sendKey = driver.findElement(By.xpath("//textarea[starts-with(@class,'gLFyf')]"));
		sendKey.sendKeys("Java");
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[starts-with(@role,'listbox')]//li"));
		for(WebElement allOption : allOptions) {
			if(allOption.getText().equalsIgnoreCase("java jdk")) {
				allOption.click();
				break;
				
			}
		}
	}
}
