package org.pom.pageObjects;

import org.openqa.selenium.By;
import org.pom.testUtilities.DriverHelper;

public class SignInModule {

	private By forgotUserName = By.xpath("//input[@name='login']");
	private By pleaseContinueClick = By.xpath("//input[starts-with(@value,'Please Continue')]");
	private By signClick = By.xpath("(//button[starts-with(@class,'m')])[1]");
	private By userEmail = By.xpath("//input[starts-with(@id,'us')]");
	private By userPassword = By.xpath("//input[starts-with(@id,'cl')]");
	
	public void signInModule(String forgotUserName2,String userEmail2,String userPassword2) {
		windowHandlingMethod1();
		maximizeTheWindow();
		forgotUserName(forgotUserName2);
		pleaseContinueClick();
		driverClose();
		windowHandlingMethod2();
		signClick();
		userEmail(userEmail2);
		userPassword(userPassword2);
		navigateBack();
	}

	public void windowHandlingMethod1() {
		DriverHelper.handleTheWindow(4);
	}
	public void maximizeTheWindow() {
		DriverHelper.maximizeTheWindow();
	}
	public void forgotUserName(String forgotUserName2) {
		DriverHelper.sendTheValue(forgotUserName, forgotUserName2);
	}
	public void pleaseContinueClick() {
		DriverHelper.clickOnElement(pleaseContinueClick);
	}
	public void driverClose() {
		DriverHelper.driverClose();
	}
	public void windowHandlingMethod2() {
		DriverHelper.handleTheWindow(3);
	}
	public void signClick() {
		DriverHelper.clickOnElement(signClick);
	}
	public void userEmail(String userEmail2) {
		DriverHelper.sendTheValue(userEmail, userEmail2);
	}
	public void userPassword(String userPassword2) {
		DriverHelper.sendTheValue(userPassword, userPassword2);
	}
	public void navigateBack() {
		DriverHelper.navigateBack();
	}
}
