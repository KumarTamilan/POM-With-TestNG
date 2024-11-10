package org.pom.pageObjects;

import org.openqa.selenium.By;
import org.pom.testUtilities.DriverHelper;

public class UserServiceModule {

	private By serviceMailId = By.xpath("//input[@id='username_ba']");
	private By servicePassword = By.xpath("//input[@id='clpass_ba']");
	private By disclaimer = By.xpath("//a[text()='Disclaimer']");
	private By rediffHome = By.xpath("//a[text()='Rediff Home']");
	private By moneyModule = By.xpath("//a[text()='Money']");
	private By helpClick = By.xpath("//a[text()='Help']");
	
	public void userServiceModule(String serviceMailId2,String servicePassword2) {
		serviceMailId(serviceMailId2);
		servicePassword(servicePassword2);
		disclaimer();
		windowHandlingMethod1();
		rediffHome();
		windowHandlingMethod2();
		moneyModule();
		driverCloseMethod1();
		windowHandlingMethod3();
		helpClick();
		navigateBack();
		driverCloseMethod2();
		windowHandlingMethod4();
		driverCloseMethod3();
		windowHandlingMethod5();
		driverCloseMethod4();
		windowHandlingMethod6();
		driverCloseMethod5();
		windowHandlingMethod7();
	}

	public void serviceMailId(String serviceMailId2) {
		DriverHelper.sendTheValue(serviceMailId, serviceMailId2);
	}
	public void servicePassword(String servicePassword2) {
		DriverHelper.sendTheValue(servicePassword, servicePassword2);
	}
	public void disclaimer() {
		DriverHelper.clickOnElement(disclaimer);
	}
	public void windowHandlingMethod1() {
		DriverHelper.handleTheWindow(4);
	}
	public void rediffHome() {
		DriverHelper.clickOnElement(rediffHome);
	}
	public void windowHandlingMethod2() {
		DriverHelper.handleTheWindow(5);
	}
	public void moneyModule() {
		DriverHelper.clickOnElement(moneyModule);
	}
	public void driverCloseMethod1() {
		DriverHelper.driverClose();
	}
	public void windowHandlingMethod3() {
		DriverHelper.handleTheWindow(4);
	}
	public void helpClick() {
		DriverHelper.clickOnElement(helpClick);
	}
	public void navigateBack() {
		DriverHelper.navigateBack();
	}
	public void driverCloseMethod2() {
		DriverHelper.driverClose();
	}
	public void windowHandlingMethod4() {
		DriverHelper.handleTheWindow(3);
	}
	public void driverCloseMethod3() {
		DriverHelper.driverClose();
	}
	public void windowHandlingMethod5() {
		DriverHelper.handleTheWindow(2);
	}
	public void driverCloseMethod4() {
		DriverHelper.driverClose();
	}
	public void windowHandlingMethod6() {
		DriverHelper.handleTheWindow(1);
	}
	public void driverCloseMethod5() {
		DriverHelper.driverClose();
	}
	public void windowHandlingMethod7() {
		DriverHelper.handleTheWindow(0);
	}
}
