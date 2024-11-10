package org.testNG2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {
	public static WebDriver driver;

	@BeforeClass
	public void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.facebook.com/");
	}

	@Test(dataProvider = "qaData")
	public void logIn(String userName, String passWord) {
		WebElement username = driver.findElement(By.xpath("//input[starts-with(@id,'email')]"));
		username.sendKeys(userName);
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@id,'pass')]"));
		password.sendKeys(passWord);
	}

	@AfterClass
	public void driverClose() {
		driver.close();
	}

	@DataProvider(name="qaData")
	public Object qaTest() {
		Object[][] data = { { "kumaran", "Kumaran@Test" }, 
										{ "karuppannan", "karuppannan@Test" },
										{ "amutha", "Amutha@Test" }, 
										{ "hamalatha", "Hemalatha@Test" } };
		return data;
	}
}
