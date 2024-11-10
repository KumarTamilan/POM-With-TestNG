package org.pom.pageObjects;

import org.openqa.selenium.By;
import org.pom.testUtilities.DriverHelper;

public class AdvertiseModule {

	private By advertiseClick = By.xpath("//a[text()='Advertise']");
	private By redName = By.xpath("//input[@id='firstname']");
	private By redCompany = By.xpath("//input[@id='company_name']");
	private By redUrl = By.xpath("//input[@id='company_url']");
	private By redEmail = By.xpath("//input[@id='email']");
	private By redPhone = By.xpath("//input[@id='phone']");
	private By redUserCity = By.xpath("//input[@id='user_city']");
	private By redQuery = By.xpath("//textarea[@id='company_query']");
	private By SubmitClick = By.xpath("//input[starts-with(@type,'sub')]");
	
	public void advertiseModule(String redName2,String redCompany2,String redUrl2,String redEmail2,
														  String redPhone2,String redUserCity2,String redQuery2) {
		advertiseClick();
		redName(redName2);
		redCompany(redCompany2);
		redUrl(redUrl2);
		redEmail(redEmail2);
		redPhone(redPhone2);
		redUserCity(redUserCity2);
		redQuery(redQuery2);
		SubmitClick();
		handleTheSimpleAlert();
		navigateBack();
	}
	public void advertiseClick() {
		org.pom.testUtilities.DriverHelper.clickOnElement(advertiseClick);
	}
	public void redName(String redName2) {
		DriverHelper.sendTheValue(redName, redName2);
	}
	public void redCompany(String redCompany2) {
		DriverHelper.sendTheValue(redCompany, redCompany2);
	}
	public void redUrl(String redUrl2) {
		DriverHelper.sendTheValue(redUrl, redUrl2);
	}
	public void redEmail(String redEmail2) {
		DriverHelper.sendTheValue(redEmail, redEmail2);
	}
	public void redPhone(String redPhone2) {
		DriverHelper.sendTheValue(redPhone, redPhone2);
	}
	public void redUserCity(String redUserCity2) {
		DriverHelper.sendTheValue(redUserCity,redUserCity2);
	}
	public void redQuery(String redQuery2) {
		DriverHelper.sendTheValue(redQuery, redQuery2);
	}
	public void SubmitClick() {
		DriverHelper.clickOnElement(SubmitClick);
	}
	public void handleTheSimpleAlert() {
		DriverHelper.handleTheSimpleAlert();
	}
	public void navigateBack() {
		DriverHelper.navigateBack();
	}
}
