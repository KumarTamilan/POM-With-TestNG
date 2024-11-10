package org.pom.testUtilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pom.testBase.BaseClass;
import org.pom.testBase.Constants;

public class DriverHelper extends BaseClass{

	public static void maximizeTheWindow() {
		driver.manage().window().maximize();
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void getPageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void getPageCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static void navigateUrl(String url) {
		driver.navigate().to(url);
	}
	public static void navigateForward() {
		driver.navigate().forward();
	}
	public static void navigateBack() {
		driver.navigate().back();
	}
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}
	public static void driverClose() {
		driver.close();
	}
	public static void driverQuit() {
		driver.quit();
	}
	public static void sendTheValue(By locator,String value) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(value);;
	}
	
	public static void clickOnElement(By locator) {
		WebElement element = driver.findElement(locator);
		element.click();
	}
	public static void clearTheElement(By locator) {
		WebElement element = driver.findElement(locator);
		element.clear();
	}
	public static void getAttributeValue(By locator,String value) {
		WebElement element = driver.findElement(locator);
		String attributeValue = element.getAttribute(value);
		System.out.println(attributeValue);
	}
	public static void getTheText(By locator) {
		WebElement element = driver.findElement(locator);
		String text = element.getText();
		System.out.println(text);
	}
	public static void isDisplayedOrNot(By locator) {
		WebElement element = driver.findElement(locator);
		boolean isDisplayed = element.isDisplayed();
		System.out.println(isDisplayed);
	}
	public static void isSelectedOrNot(By locator) {
		WebElement element = driver.findElement(locator);
		boolean isSelected = element.isSelected();
		System.out.println(isSelected);
	}
	public static void isEnabledOrNot(By locator) {
		WebElement element = driver.findElement(locator);
		boolean isEnabled = element.isEnabled();
		System.out.println(isEnabled);
	}
//	public static void takeTheScreenshotInOneTimeOnFullPage(String filePath) {
//		try {
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File(filePath);
//		FileUtils.copyFile(source, destination);
//		}
//		catch(IOException e) {
//			System.out.println("Throw the IOException");
//		}
//	}
//	public static void takeTheScreenshotInOneTimeOnParticularElement(By locator,String filePath) {
//		try {
//		WebElement element = driver.findElement(locator);
//		File source = element.getScreenshotAs(OutputType.FILE);
//		File destination = new File(filePath);
//		FileUtils.copyFile(source, destination);
//		}
//		catch(IOException e) {
//			System.out.println("Throw the IOException");
//		}
//		
//	}
	public static void takeTheScreenshotOnMultipleTimes(String fileName) {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sources1 = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(Constants.getScreenshotPath()+"//"+fileName+System.currentTimeMillis()+".png");
		try {
		FileHandler.copy(sources1, destination);
		}
		catch(FileNotFoundException e) {
			System.out.println("Throw the FileNotFoundException");
		}
		catch(IOException e) {
			System.out.println("Throw the IOException");
		}
	}
	public static void dropDown(By locator,String type,String value) {
		WebElement element = driver.findElement(locator);
		Select s = new Select(element);
		
		if(type.equals("byIndex")) {
			Integer valueOf = Integer.valueOf(value);
			s.selectByIndex(valueOf);
		}
		else if(type.equals("byValue")) {
			s.selectByValue(value);
		}
		else if(type.equals("byVisibleText")) {
			s.selectByVisibleText(value);
		}
	}
	public static void selectByIndex(By locator,int index) {
		WebElement element = driver.findElement(locator);
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	public static void selectByValue(By locator,String value) {
		WebElement element = driver.findElement(locator);
		Select s = new Select(element);
		s.selectByValue(value);
	}
	public static void selectByVisibleText(By locator,String text) {
		WebElement element = driver.findElement(locator);
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	public static void selectByDropdownOptionUsingGetOptions(By locator,String value) {
		WebElement element = driver.findElement(locator);
		Select s = new Select(element);
		List<WebElement> allOptions = s.getOptions();
		for(WebElement allOp : allOptions) {
			if(allOp.getText().equals(value)){
				allOp.click();
				break;
		}
				}
}
	public static void forLoopUsingClickTheDropDown(By locator,String value) {
		List<WebElement> element = driver.findElements(locator);
		for(WebElement all : element) {
			if(all.getText().equals(value)) {
				all.click();
				break;
			}
		}
	}
	public static void getTheDropdownAllOptions(By locator) {
		WebElement element = driver.findElement(locator);
		Select s = new Select(element);
		List<WebElement> getAllOptions = s.getOptions();
		for(WebElement allOptions : getAllOptions) {
			String allOption = allOptions.getText();
			System.out.println(allOption);
		}
	}
	public static void selectTheBootsTrapDropdown(By locator) {
		
	}
	public static void getTheDropdownOptionWithoutGetOptions() {
		
	}
	public static void getFirstSelectedOptions(By locator) {
		WebElement element = driver.findElement(locator);
		Select s = new Select(element);
		s.getFirstSelectedOption();
	}
	public static void getAllSelectedOptions(By locator) {
		WebElement element = driver.findElement(locator);
		Select s = new Select(element);
		s.getAllSelectedOptions();
	}
	public static void deSelectedTheAllOptions(By locator) {
		WebElement element = driver.findElement(locator);
		Select s = new Select(element);
		s.deselectAll();
	}
	public static void handleTheSimpleAlert() {
		driver.switchTo().alert().accept();
	}
	public static void handleTheConfirmAlert() {
		driver.switchTo().alert().accept();
	}
	public static void handleThePromptAlert(String value) {
		driver.switchTo().alert().sendKeys(value);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}
	public static void handleTheAuthenticationPopup(String username,String password,String urlFirstHalf,String urlSecondHalf) {
		driver.get(urlFirstHalf+username+password+urlSecondHalf);
		
		//https://admin:admin@the-internet.herokuapp.com/basic_auth

	}
	public static void handleThePermissionBasedPopup() {
		ChromeOptions co = new ChromeOptions();	
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
	}
	public static void handleTheFrameUsingIndex(int index) {
		driver.switchTo().frame(index);
	}
	public static void handleTheFrameUsingWebElement(By locator) {
		WebElement element = driver.findElement(locator);
		driver.switchTo().frame(element);
	}
	public static void handleTheFrameUsingId(String id) {
		driver.switchTo().frame(id);
	}
	public static void handleTheFrameUsingName(String name) {
		driver.switchTo().frame(name);
	}
	public static void switchFromInnerFrameToParentFrame() {
		driver.switchTo().parentFrame();
	}
	public static void switchFromFrameToWebPage() {
		driver.switchTo().defaultContent();
	}
	public static void javaScriptExecutorUsingSendKeys(By locator,String value) {
		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='"+value+"'",element);
	}
	public static void javaScriptExecutorUsingClick(By locator) {
		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
	}
	public static void javaScriptExecutorUsingScrollIntoView(By locator) {
		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
	}
	public static void javaScriptExecutorUsingScrollToWebsiteEnd() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	public static void javaScriptExecutorUsingScrollToWebsiteTop() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight);");
	}
	public static void javaScriptExecutorUsingScrollDown(int xaxis,int yaxis) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+xaxis+","+yaxis+");");
	}
	public static void javaScriptExecutorUsingScrollUp(int xaxis,int yaxis) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+xaxis+",-"+yaxis+")");
	}
	
	public static void javaScriptExecutorUsingRefreshTheWebPage() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}
	public static void actionsUsingSendKeys(String value) {
		Actions as = new Actions(driver);
		as.sendKeys(value).perform();
	}
	public static void actionsUsingClick(By locator) {
		WebElement element = driver.findElement(locator);
		Actions as = new Actions(driver);
		as.click(element).perform();
	}
	public static void actionsUsingContextClick(By locator) {
		WebElement element = driver.findElement(locator);
		Actions as = new Actions(driver);
		as.contextClick(element).perform();
	}
	public static void actionsUsingDoubleClick(By locator) {
		WebElement element = driver.findElement(locator);
		Actions as = new Actions(driver);
		as.doubleClick(element).perform();
	}
	public static void actionsUsingDragAndDrop(By locator) {
		WebElement element1 = driver.findElement(locator);
		WebElement element2= driver.findElement(locator);
		Actions as = new Actions(driver);
		as.dragAndDrop(element1,element2).perform();
	}
	public static void actionsUsingDragAndDropBy(By locator,int xaxis,int yaxis) {
		WebElement element = driver.findElement(locator);
		Actions as = new Actions(driver);
		as.dragAndDropBy(element,xaxis,yaxis).perform();
	}
	public static void actionsUsingSlider(WebElement element,int xaxis,int yaxis) {
		Actions as = new Actions(driver);
		as.dragAndDropBy(element,xaxis,yaxis).perform();
	}
	public static void actionsUsingMoveToElement(By locator) {
		WebElement element = driver.findElement(locator);
		Actions as = new Actions(driver);
		as.moveToElement(element).perform();
	}
	public static void actionsUsingClickOnHoldAndRelease(By locator) {
		WebElement element1 = driver.findElement(locator);
		WebElement element2 = driver.findElement(locator);
		WebElement element3 = driver.findElement(locator);
		Actions as = new Actions(driver);
		as.clickAndHold(element1)
		   .moveToElement(element2)
		   .release(element3)
		   .build()
		   .perform();
	}
	public static void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	public static void explicitWaitForElementToBeSelected(Duration seconds,By locator) {
		WebElement element = driver.findElement(locator);
		WebDriverWait wait = new WebDriverWait(driver,seconds);
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	public static void explicitWaitForElementToBeClickable(Duration seconds,By locator) {
		WebElement element = driver.findElement(locator);
		WebDriverWait wait = new WebDriverWait(driver,seconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public static void explicitWaitForVisibilityOf(Duration seconds,By locator) {
		WebElement element = driver.findElement(locator);
		WebDriverWait wait = new WebDriverWait(driver,seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void fluentWait(int maximumTime,int pollingInterval) {
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(maximumTime));
		wait.pollingEvery(Duration.ofSeconds(pollingInterval));
		wait.ignoring(Exception.class);
	}
	public static void handleTheWindow(int index) {
		
		Set<String> allWindows = driver.getWindowHandles();
		List<String> list = new ArrayList(allWindows);
		driver.switchTo().window(list.get(index));
	}
	public static void wait(int index) {
		try {
			Thread.sleep(index);
		}
		catch(InterruptedException e ) {
			System.out.println("Thow the TimeOutException");
		}
	}
}
