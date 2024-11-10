package org.pom.pageObjects;

import org.openqa.selenium.By;
import org.pom.testUtilities.DriverHelper;

public class PrivacyModule {

	private By privacyClick = By.xpath("//a[text()='Privacy']");
	private By rediffUrlScrollView = By.xpath("(//a[text()='http://support.rediff.com/'])[1]");
	private By rediffUrlClick = By.xpath("(//a[text()='http://support.rediff.com/'])[1]");
	private By issueField = By.xpath("//input[@id='s']");
	private By searchClick = By.xpath("//input[@id='searchsubmit']");
	
	public void privacyModule(String issueField2) {
		privacyClick();
		rediffUrlScrollView();
		rediffUrlClick();
		windowHandlingMethod();
		issueField(issueField2);
		searchClick();
	}

	public void privacyClick() {
		DriverHelper.clickOnElement(privacyClick);
	}
	public void rediffUrlScrollView() {
		DriverHelper.javaScriptExecutorUsingScrollIntoView(rediffUrlScrollView);
	}
	public void rediffUrlClick() {
		DriverHelper.clickOnElement(rediffUrlClick);
	}
	public void windowHandlingMethod() {
		DriverHelper.handleTheWindow(3);
	}
	public void issueField(String issueField2) {
		DriverHelper.sendTheValue(issueField, issueField2);
	}
	public void searchClick() {
		DriverHelper.clickOnElement(searchClick);
	}

	
}
