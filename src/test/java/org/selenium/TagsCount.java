package org.selenium;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TagsCount {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/r.php");
		
		//1.How to write Absolute X-path ? With code ?

		WebElement firstName = driver.findElement(By.xpath("(html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div/div/div/div/div/input)[1]"));
		firstName.sendKeys("Kumaran");
		WebElement lastName = driver.findElement(By.xpath("html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div/div/div[2]/div/div/input"));
		lastName.sendKeys("Karuppannan");
		WebElement dateDropDown = driver.findElement(By.xpath("(html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[2]/div[2]/span/span/select)[1]"));
		Select s = new Select(dateDropDown);
		s.selectByValue("15");
		WebElement monthDropDown = driver.findElement(By.xpath("(html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[2]/div[2]/span/span/select)[2]"));
		Select s1 = new Select(monthDropDown);
		s1.selectByVisibleText("Aug");
		WebElement yearDropDown = driver.findElement(By.xpath("(html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[2]/div[2]/span/span/select)[3]"));
		Select s2 = new Select(yearDropDown);
		s2.selectByVisibleText("1993");
		WebElement maleDropDown = driver.findElement(By.xpath("html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[4]/span/span[2]/label/input"));
		maleDropDown.click();
		

	}
}
