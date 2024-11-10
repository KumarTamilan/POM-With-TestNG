package org.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PriorityAnnotation {

public static WebDriver driver;
	
	//5.What is priority ? How to perform ?

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
	@Test(priority=-4 )
	public void passWord() {
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@id,'pass')]"));
		password.sendKeys("Kumaran123");
	}
	@Test(priority= -3)
	public void createNewAccountClick() {
		WebElement createNewAccountClick = driver.findElement(By.xpath("//a[contains(text(),'Create n')]"));
		createNewAccountClick.click();
	}
	@Test(priority=-2 )
	public void firstName() {
		WebElement firstNameField = driver.findElement(By.xpath("//input[starts-with(@name,'firstname')]"));
		firstNameField.sendKeys("Kumaran");
	}
	@Test(priority= -1)
	public void lastName() {
		WebElement lastNameField = driver.findElement(By.xpath("//input[starts-with(@name,'lastname')]"));
		lastNameField.sendKeys("Karuppannan");
	}
	@Test(priority= 0)
	public void daySelectMethod() {
		WebElement day = driver.findElement(By.xpath("//select[starts-with(@id,'day')]"));
		Select s = new Select(day);
		s.selectByValue("15");
	}
	@Test(priority= 1)
	public void monthSelectMethod() {
		WebElement month = driver.findElement(By.xpath("//select[starts-with(@id,'month')]"));
		Select s = new Select(month);
		s.selectByValue("8");
	}
	@Test(priority= 2)
	public void yearSelectMethod() {
		WebElement year = driver.findElement(By.xpath("//select[starts-with(@id,'year')]"));
		Select s = new Select(year);
		s.selectByValue("1993");
	}
	@Test(priority= 3)
	public void genderClickMethod() {
		WebElement maleClick = driver.findElement(By.xpath("(//input[starts-with(@id,'sex')])[2]"));
		maleClick.click();
	}
	@Test(priority= 4)
	public void mobileNumberMethod() {
		WebElement mobileNumber = driver.findElement(By.xpath("//input[starts-with(@name,'reg_email__')]"));
		mobileNumber.sendKeys("7583737485");
	}
	@Test(priority= 5)
	public void newPasswordMethod() throws InterruptedException{
		WebElement lastNameField = driver.findElement(By.xpath("//input[starts-with(@name,'reg_pas')]"));
		lastNameField.sendKeys("Kumaran12345");
		Thread.sleep(3000);
	}
	
	@AfterClass
	public void driverClose() {
		driver.close();
	}
	
}