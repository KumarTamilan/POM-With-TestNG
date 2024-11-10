package org.pom.pageObjects;

import org.openqa.selenium.By;
import org.pom.testUtilities.DriverHelper;

public class RediffMailModule {

	 private By rediffMailClick = By.xpath("//a[text()='Rediffmail']");
	 private By username = By.xpath("//input[@id='login1']");
	 private By password = By.xpath("//input[@id='password']");
	 private By signInClick = By.xpath("//input[@name='proceed']");
	 private By backToLoginClick = By.xpath("//a[text()='« Back to login page']");
	
	public  void rediffMailModule(String username2,String password2) {
		rediffMailClick();
		username(username2);
		password( password2);
		signInClick();
		backToLoginClick();
	}

	public void rediffMailClick() {
		DriverHelper.clickOnElement(rediffMailClick);
	}
	public void username(String username2) {
		DriverHelper.sendTheValue(username, username2);
	}
	public void password(String password2) {
		DriverHelper.sendTheValue(password, password2);
	}
	public void signInClick() {
		DriverHelper.clickOnElement(signInClick);
	}
	public void backToLoginClick() {
		DriverHelper.clickOnElement(backToLoginClick);
	}
}
