package org.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framess {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		
		//4.How to switch from webpage to Frame ? with code ?
		//5.If we are stay in SecondFrame [OR] inneriFrame,Now i want go to
		//   First Frame.So,How to Handle ?
		//6.If we are stay in SecondFrame [OR] inneriFrame,Now i want go to
		//  WebPage.So,How to Handle ?

		//				SINGLE FRAME 
		WebElement singleFrame = driver.findElement(By.xpath("//iframe[starts-with(@id,'singleframe')]"));
		driver.switchTo().frame(singleFrame);
		
		WebElement textField = driver.findElement(By.xpath("(//input[starts-with(@type,'text')])[1]"));
		textField.sendKeys("Kumaran");
		//				SINGLE FRAME :  iFrame (To) WebPage
		driver.switchTo().defaultContent();
		//				MULTIPLE FRAME :  
		WebElement multipleFrameClick = driver.findElement(By.xpath("//a[contains(text(),'Iframe w')]"));
		multipleFrameClick.click();
		//				MULTIPLE FRAME :  WebPage (To) First IFrame
		WebElement multipleFrame = driver.findElement(By.xpath("//iframe[starts-with(@src,'MultipleFrames.html')]"));
		driver.switchTo().frame(multipleFrame);
		//				MULTIPLE FRAME :  First IFrame (To) Inner IFrame [OR] Second IFrame
		WebElement innerIFrame = driver.findElement(By.xpath("//iframe[starts-with(@src,'SingleFrame.html')]"));
		driver.switchTo().frame(innerIFrame);
		//				MULTIPLE FRAME :  Second IFrame Text Field
		WebElement textField2 = driver.findElement(By.xpath("//input[starts-with(@type,'text')]"));
		textField2.sendKeys("Karuppannan");
		//				MULTIPLE FRAME :  Second IFrame (To) First IFrame
		driver.switchTo().parentFrame();
		//				MULTIPLE FRAME :  First IFrame (To) WebPage
		driver.switchTo().defaultContent();
		//    			WebPage Click :
		WebElement webPage = driver.findElement(By.xpath("//a[contains(text(),'Sing')]"));
		webPage.click();
		
		
		
		
		
	}
}
