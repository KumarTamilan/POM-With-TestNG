package org.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeTheScreenshot {
	public static WebDriver driver;

	// 2.How to take the Screenshot in FullPage using FileUtils ?

	public static void takeScreenshotFullPage() throws InterruptedException, IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/r.php");

		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(".\\src\\test\\resources\\Screenshots\\FullPage1.png");
		FileUtils.copyFile(source, destination);

	}

	// 4.How to take the Screenshot in particular Element Using FileUtils?

	public static void takeScreenshotParticularElement() throws InterruptedException, IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(3000);

		WebElement particularElement = driver.findElement(By.xpath("//div[@class='_9bp-']"));
		File source1 = particularElement.getScreenshotAs(OutputType.FILE);
		File destination1 = new File(".\\src\\test\\resources\\Screenshots\\Element1.png");
		FileUtils.copyFile(source1, destination1);
	}

	
	
	

	// 6.How to take the Screenshot in particular page In Multiple times Using
	// 		FileHandler ?
	
	public static void takeScreenshotFullPageInMultipleTimes() throws InterruptedException, IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/r.php");

		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				".\\src\\test\\resources\\Screenshots\\FullPage" + System.currentTimeMillis() + ".png");
		FileHandler.copy(source, destination);

	}

	public static void main(String[] args) throws InterruptedException, IOException {
		takeScreenshotFullPageInMultipleTimes();
	}
}



