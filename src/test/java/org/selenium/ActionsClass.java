package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://www.facebook.com/");
		
		//1.How to pass the value to webpage input Field Using Robot Class ?

		//				KEYS
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_J);
		r.keyRelease(KeyEvent.VK_J);
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_J);
		r.keyRelease(KeyEvent.VK_J);
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		// 4.How to Handle the Mouse Based Action Using Actions Class ?
//
//		// SENDKEYS :
//
//		WebElement sendKey = driver.findElement(By.xpath("//input[starts-with(@type,'text')]"));
//		Actions as = new Actions(driver);
//		as.sendKeys("Kumaran").perform();
//
//		// CLICK :
//
//		WebElement click = driver.findElement(By.xpath("//a[contains(text(),'For')]"));
//		as.click(click).perform();
//
//		// doubleclick :
//
//		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
//
//		WebElement doubleClick = driver.findElement(By.xpath("//button[starts-with(@ondblclick,'myFunction()')]"));
//		as.doubleClick(doubleClick).perform();
//		driver.switchTo().alert().accept();
//
//		// CONTEXTCLICK :
//
//		WebElement contextClick = driver.findElement(By.xpath("//span[contains(text(),'r')]"));
//		as.contextClick(contextClick).perform();
//
//		// MOVE TO ELEMENT :
//
//		driver.navigate().to("https://stqatools.com/demo/MouseHover.php");
//		WebElement moveToElement = driver.findElement(By.xpath("//button[contains(text(),'M')]"));
//		as.moveToElement(moveToElement).perform();
//		List<WebElement> allOptions = driver.findElements(By.xpath("//div[starts-with(@class,'dropdown-content')]//a"));
//		for (WebElement all : allOptions) {
//			if (all.getText().equals("Link 2")) {
//				all.click();
//				break;
//			}
//		}
//		// DRAG AND DROP :
//
//		driver.navigate().to("https://demo.automationtesting.in/Static.html");
//
//		WebElement drag = driver.findElement(By.xpath("//img[starts-with(@id,'angular')]"));
//		WebElement drop = driver.findElement(By.xpath("//div[starts-with(@id,'droparea')]"));
//		as.dragAndDrop(drag, drop).perform();
//
//		// DRAG AND DROP BY :[SLIDER]
//
//		driver.navigate().to("https://www.globalsqa.com/demo-site/sliders/");
//
//		WebElement frame = driver.findElement(By.xpath("(//iframe[starts-with(@width,'700')])[1]"));
//		driver.switchTo().frame(frame);
//		WebElement slider = driver.findElement(By.xpath("(//span[starts-with(@tabindex,'0')])[1]"));
//		as.dragAndDropBy(slider, -40, 0).perform();
	}
}
