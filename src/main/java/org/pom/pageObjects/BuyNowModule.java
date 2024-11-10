package org.pom.pageObjects;

import org.openqa.selenium.By;
import org.pom.testUtilities.DriverHelper;

public class BuyNowModule {

	private By buyNowClick = By.xpath("//a[text()='Buy Now']");
	private By loginClick = By.xpath("(//a[text()='Login'])[2]");
	private By panelEmail = By.xpath("//input[starts-with(@id,'username_d')]");
	private By panelPassword = By.xpath("//input[starts-with(@id,'clpass_d')]");
	private By panelCaptcha = By.xpath("(//input[starts-with(@class,'rw-p')])[1]");
	private By rememberClick = By.xpath("(//input[starts-with(@id,'rem')])[1]");
	private By forgotPassword = By.xpath("(//a[text()='Forgot Password?'])[1]");
	
	public void buyNowModule(String panelEmail2,String panelPassword2,String panelCaptcha2) {
		handleTheSimpleAlert();
		buyNowClick();
		loginClick();
		panelEmail(panelEmail2);
		panelPassword(panelPassword2);		
		panelCaptcha(panelCaptcha2);
		rememberClick();
		forgotPassword();
	}

	public void handleTheSimpleAlert() {
		DriverHelper.handleTheSimpleAlert();
	}
	public void buyNowClick() {
		DriverHelper.clickOnElement(buyNowClick);
	}
	public void loginClick() {
		DriverHelper.clickOnElement(loginClick);
	}
	public void panelEmail(String panelEmail2) {
		DriverHelper.sendTheValue(panelEmail, panelEmail2);
	}
	public void panelPassword(String panelPassword2) {
		DriverHelper.sendTheValue(panelPassword, panelPassword2);
	}
	public void panelCaptcha(String panelCaptcha2) {
		DriverHelper.sendTheValue(panelCaptcha, panelCaptcha2);
	}
	public void rememberClick() {
		DriverHelper.clickOnElement(rememberClick);
	}
	public void forgotPassword() {
		DriverHelper.clickOnElement(forgotPassword);
	}
}
