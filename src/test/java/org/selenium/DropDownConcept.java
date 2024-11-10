package org.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");

		// 6.How to handle the BootstrapDropDown ? (TagName without select)

		WebElement allOption = driver.findElement(By.xpath("//a[@role='menuitem']"));
		List<WebElement> linkText = allOption.findElements(By.tagName("a"));
		System.out.println(linkText.size());
		for (WebElement links : linkText) {
			
			System.out.println(links.getText());
			System.out.println(links.getAttribute("href"));
		}

		WebElement bootstrapDropDown = driver.findElement(By.xpath("//button[contains(text(),'Tutorial')]"));
		bootstrapDropDown.click();
		Thread.sleep(6000);
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@role='menu']//li"));
		for (WebElement allOpti : allOptions) {
			if (allOpti.getText().equals("JavaScript")) {
				allOpti.click();
				break;
			}
		}

		// -How to get all Text from BootstrapDropDown ?

	}
}
