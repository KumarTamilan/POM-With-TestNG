package org.pom.pageObjects;

import org.openqa.selenium.By;
import org.pom.testUtilities.DriverHelper;

public class UserPanelModule {

	private By reSellerPanel = By.xpath("//a[text()='Reseller Panel']");
	private By panelUsername = By.xpath("//input[starts-with(@id,'username_b')]");
	private By panelPassword2 = By.xpath("//input[starts-with(@id,'clpass_b')]");
	private By panelAboveText = By.xpath("(//input[starts-with(@name,'va')])[2]");
	private By rememberClick2 = By.xpath("//input[@id='remember_r']");
	private By signInClick2 = By.xpath("(//button[text()='Sign in'])[2]");
	
	public void userPanelModule(String panelUsername2,String panelPassword22,String panelAboveText2) {
		reSellerPanel();
		panelUsername(panelUsername2);
		panelPassword2(panelPassword22);
		panelAboveText(panelAboveText2);
		rememberClick2();
		signInClick2();
	}

	public void reSellerPanel() {
		DriverHelper.clickOnElement(reSellerPanel);
	}
	public void panelUsername(String panelUsername2) {
		DriverHelper.sendTheValue(panelUsername, panelUsername2);
	}
	public void panelPassword2(String panelPassword22) {
		DriverHelper.sendTheValue(panelPassword2,panelPassword22);
	}
	public void panelAboveText(String panelAboveText2) {
		DriverHelper.sendTheValue(panelAboveText, panelAboveText2);
	}
	public void rememberClick2() {
		DriverHelper.clickOnElement(rememberClick2);
	}
	public void signInClick2() {
		DriverHelper.clickOnElement(signInClick2);
	}
}
