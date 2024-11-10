package org.pom.pageObjects;

import org.openqa.selenium.By;
import org.pom.testUtilities.DriverHelper;

public class PolicyModule {

	private By policyClick = By.xpath("//a[text()='privacy policy']");
	private By feedbackScrollView = By.xpath("//a[text()='feedback form']");
	private By feedbackClick = By.xpath("//a[text()='feedback form']");
	private By nameField = By.xpath("//input[@name='username']");
	private By emailField = By.xpath("//input[@name='emailId']");
	private By commentField = By.xpath("//textarea[@name='comments']");
	private By captchaEnter = By.xpath("//input[@name='captcha']");
	private By submitClick = By.xpath("//input[@value='Submit']");
	
	public void policyModule(String nameField2,String emailField2,String commentField2,String captchaEnter2) {
		simpleAlertHandling();
		policyClick();
		windowHandlingMethod1();
		feedbackScrollView();
		feedbackClick();
		windowHandlingMethod2();
		nameField(nameField2);
		emailField(emailField2);
		commentField(commentField2);
		captchaEnter(captchaEnter2);
		submitClick();
	}
	public void simpleAlertHandling() {
		DriverHelper.handleTheSimpleAlert();
	}
	public void policyClick() {
		DriverHelper.clickOnElement(policyClick);
	}
	public void windowHandlingMethod1() {
		DriverHelper.handleTheWindow(1);
	}
	public void feedbackScrollView() {
		DriverHelper.javaScriptExecutorUsingScrollIntoView(feedbackScrollView);
	}
	public void feedbackClick() {
		DriverHelper.clickOnElement(feedbackClick);
	}
	public void windowHandlingMethod2() {
		DriverHelper.handleTheWindow(2);
	}
	public void nameField(String nameField2) {
		DriverHelper.sendTheValue(nameField, nameField2);
	}
	public void emailField(String emailField2) {
		DriverHelper.sendTheValue(emailField, emailField2);
	}
	public void commentField(String commentField2) {
		DriverHelper.sendTheValue(commentField, commentField2);
	}
	public void captchaEnter(String captchaEnter2) {
		DriverHelper.sendTheValue(captchaEnter, captchaEnter2);
	}
	public void submitClick() {
		DriverHelper.clickOnElement(submitClick);
	}
}
