package org.pom.pageObjects;
import org.openqa.selenium.By;
import org.pom.testUtilities.DriverHelper;

public class BecomeAResellerModule {

	private By becomeResellerClick = By.xpath("//a[text()='Become a reseller']");
	private By reSellerLoginId = By.xpath("//input[starts-with(@name,'txt_use')]");
	private By reSellerFirstName = By.xpath("//input[starts-with(@name,'txt_first')]");
	private By reSellerLastName = By.xpath("//input[starts-with(@name,'txt_last')]");
	private By reSellerCity = By.xpath("//select[starts-with(@name,'cmb_c')]//option");
	private By reSellerPhoneNumber = By.xpath("//input[starts-with(@name,'txt_m')]");
	private By reSellerAboveText = By.xpath("//input[starts-with(@id,'vali')]");
	private By checkBox = By.xpath("//input[starts-with(@name,'chk')]");
	private By continueClick = By.xpath("//input[@type='submit']");
	private By continueClick2 = By.xpath("//input[@type='submit']");
	
	public void becomeAResellerModule(String reSellerLoginId2,String reSellerFirstName2,
			String reSellerLastName2,String reSellerCity2,String reSellerPhoneNumber2,
			String reSellerAboveText2) {
		becomeResellerClick();
		reSellerLoginId(reSellerLoginId2);
		reSellerFirstName(reSellerFirstName2);
		reSellerLastName(reSellerLastName2);
		reSellerCity(reSellerCity2);
		reSellerPhoneNumber(reSellerPhoneNumber2);
		reSellerAboveText(reSellerAboveText2);
		checkBox();
		continueClick();
		continueClick2();
	}

	public void becomeResellerClick() {
		DriverHelper.clickOnElement(becomeResellerClick);
	}
	public void reSellerLoginId(String reSellerLoginId2) {
		DriverHelper.sendTheValue(reSellerLoginId, reSellerLoginId2);
	}
	public void reSellerFirstName(String reSellerFirstName2) {
		DriverHelper.sendTheValue(reSellerFirstName, reSellerFirstName2);
	}
	public void reSellerLastName(String reSellerLastName2) {
		DriverHelper.sendTheValue(reSellerLastName, reSellerLastName2);
	}
	public void reSellerCity(String reSellerCity2) {
		DriverHelper.forLoopUsingClickTheDropDown(reSellerCity, reSellerCity2);
	}
	public void reSellerPhoneNumber(String reSellerPhoneNumber2) {
		DriverHelper.sendTheValue(reSellerPhoneNumber, reSellerPhoneNumber2);
	}
	public void reSellerAboveText(String reSellerAboveText2) {
		DriverHelper.sendTheValue(reSellerAboveText, reSellerAboveText2);
	}
	public void checkBox() {
		DriverHelper.clickOnElement(checkBox);
	}
	public void continueClick() {
		DriverHelper.clickOnElement(continueClick);
	}
	public void continueClick2() {
		DriverHelper.clickOnElement(continueClick2);
	}
}
