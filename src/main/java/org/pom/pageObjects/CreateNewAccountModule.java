package org.pom.pageObjects;

import org.openqa.selenium.By;
import org.pom.testUtilities.DriverHelper;

public class CreateNewAccountModule {

	private By newAccountClick = By.xpath("//u[contains(text(),'C')]");
	private By fullName = By.xpath("//input[starts-with(@name,'name')]");
	private By mailId = By.xpath("//input[starts-with(@name,'login')]");
	private By checkAvailability = By.xpath("//input[starts-with(@name,'btnchka')]");
	private By accountPassword = By.xpath("//input[@id='newpasswd']");
	private By firstEyeIcon = By.xpath("//em[@id='eyeiconNew']");
	private By reTypePassword = By.xpath("//input[starts-with(@name,'confirm_pas')]");
	private By secondEyeIcon = By.xpath("//em[@id='eyeiconRe']");
	private By alternateEmail = By.xpath("//input[starts-with(@name,'altem')]");
	private By country = By.xpath("//div[starts-with(@onclick,'java')]");
	private By allCountries = By.xpath("//div[@id='country_id']//li");
	private By recoverPassword = By.xpath("//input[starts-with(@name,'mob')]");
	private By dayClick = By.xpath("//select[starts-with(@name,'DOB_Day')]");
	private By allDays = By.xpath("//select[starts-with(@name,'DOB_Day')]//option");
	private By monthClick = By.xpath("//select[starts-with(@name,'DOB_Month')]");
	private By allMonths = By.xpath("(//select[starts-with(@name,'DOB')])[2]//option");
	private By yearClick = By.xpath("//select[starts-with(@name,'DOB_Year')]");
	private By allYears = By.xpath("(//select[starts-with(@name,'DOB')])[3]//option");
	private By femaleClick = By.xpath("(//input[starts-with(@name,'gender')])[2]");
	private By maleClky = By.xpath("(//input[starts-with(@name,'gender')])[1]");
	private By countryClick = By.xpath("//select[@id='country']");
	private By allCountry = By.xpath("//select[@id='country']//option");
	private By enterCaptcha = By.xpath("//input[starts-with(@class,'captcha')]");
	private By createAccountClick = By.xpath("//input[@id='Register']");
	
	public void createNewAccountModule(String fullName2,
																		  String mailId2,
																		  String accountPassword2,
																		  String reTypePassword2,
																		  String alternateEmail2,
																		  String allCountries2,
																		  String recoverPassword2,
																		  String allDays2,
																		  String allMonths2,
																		  String allYears2,
																		  String allCountry2,
																		  String enterCaptcha2) {
		newAccountClick();
		fullName(fullName2);
		mailId(mailId2);
		checkAvailability();
		accountPassword(accountPassword2);
		firstEyeIcon();
		reTypePassword(reTypePassword2);
		secondEyeIcon();
		alternateEmail(alternateEmail2);
		country();
		allCountries(allCountries2);
		recoverPassword(recoverPassword2);
		dayClick();
		allDays(allDays2);
		monthClick();
		allMonths(allMonths2);
		yearClick();
		allYears(allYears2);
		femaleClick();
		maleClky();
		countryClick();
		allCountry(allCountry2);
		enterCaptcha(enterCaptcha2);
		createAccountClick();
	}

	public void newAccountClick() {
		DriverHelper.clickOnElement(newAccountClick);
	}
	public void fullName(String fullName2) {
		DriverHelper.sendTheValue(fullName, fullName2);
	}
	public void mailId(String mailId2) {
		DriverHelper.sendTheValue(mailId, mailId2);
	}
	public void checkAvailability() {
		DriverHelper.clickOnElement(checkAvailability);
	}
	public void accountPassword(String accountPassword2) {
		DriverHelper.sendTheValue(accountPassword, accountPassword2);
	}
	public void firstEyeIcon() {
		DriverHelper.clickOnElement(firstEyeIcon);
	}
	public void reTypePassword(String reTypePassword2) {
		DriverHelper.sendTheValue(reTypePassword, reTypePassword2);
	}
	public void secondEyeIcon() {
		DriverHelper.clickOnElement(secondEyeIcon);
	}
	public void alternateEmail(String alternateEmail2) {
		DriverHelper.sendTheValue(alternateEmail, alternateEmail2);
	}
	public void country() {
		DriverHelper.clickOnElement(country);
	}
	public void allCountries(String allCountries2) {
		DriverHelper.forLoopUsingClickTheDropDown(allCountries, allCountries2);
	}
	public void recoverPassword(String recoverPassword2) {
		DriverHelper.sendTheValue(recoverPassword, recoverPassword2);
	}
	public void dayClick() {
		DriverHelper.clickOnElement(dayClick);
	}
	public void allDays(String allDays2) {
		DriverHelper.forLoopUsingClickTheDropDown(allDays, allDays2);
	}
	public void monthClick() {
		DriverHelper.clickOnElement(monthClick);
	}
	public void allMonths(String allMonths2) {
		DriverHelper.forLoopUsingClickTheDropDown(allMonths, allMonths2);
	}
	public void yearClick() {
		DriverHelper.clickOnElement(yearClick);
	}
	public void allYears(String allYears2) {
		DriverHelper.forLoopUsingClickTheDropDown(allYears, allYears2);
	}
	public void femaleClick() {
		DriverHelper.clickOnElement(femaleClick);
	}
	public void maleClky() {
		DriverHelper.clickOnElement(maleClky);
	}
	public void countryClick() {
		DriverHelper.clickOnElement(countryClick);
	}
	public void allCountry(String allCountry2) {
		DriverHelper.forLoopUsingClickTheDropDown(allCountry, allCountry2);
	}
	public void enterCaptcha(String enterCaptcha2) {
		DriverHelper.sendTheValue(enterCaptcha,enterCaptcha2);
	}
	public void createAccountClick() {
		DriverHelper.clickOnElement(createAccountClick);
	}
}
