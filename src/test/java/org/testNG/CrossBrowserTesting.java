package org.testNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

public  WebDriver driver;

//26.What is CROSSBROWSER TEST ?How to perform ?

	@Parameters({"browser"})
	@BeforeClass(alwaysRun=true)
	public void browserLaunch(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
	}
	@Parameters({"username1","password1","tagName1"})
	@Test
	public void logInField(String userName,String passWord,String tagName) throws InterruptedException{
		WebElement username = driver.findElement(By.xpath("//input[starts-with(@id,'email')]"));
		username.sendKeys(userName);
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@id,'pass')]"));
		password.sendKeys(passWord);
		
		List<WebElement> links = driver.findElements(By.tagName(tagName));
		for(WebElement link : links) {
			System.out.println(link.getAttribute("href")+"----->"+link.getText());
		}
	}
}
