package org.pom.testBase;

import org.pom.testUtilities.PropertiesReader;

public class Constants {

	public static String getBrowser1() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("browser1");
	}
	public static String getBrowser2() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("browser2");
	}
	public static String getBrowser3() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("browser3");
	}
	public static String getStartMaximized() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("startMaximized");
	}
	public static String getUrl() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("url");
	}
	public static String getUsername() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("username");
	}
	public static String getPassword() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("password");
	}
	public static String getFullname() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("fullname");
	}
	public static String getMailId() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("mailId");
	}
	public static String getAccountPassword() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("accountPassword");
	}
	public static String getReTypePassword() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("reTypePassword");
	}
	public static String getAlternateEmail() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("alternateEmail");
	}
	public static String getAllCountries() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("allCountries");
	}
	public static String getRecoverPassword() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("recoverPassword");
	}
	public static String getAllDays() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("allDays");
	}
	public static String getAllMonths() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("allMonths");
	}
	public static String getAllYears() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("allYears");
	}
	public static String getAllCountry() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("allCountry");
	}
	public static String getEnterCaptcha() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("enterCaptcha");
	}
	public static String getNameField() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("nameField");
	}
	public static String getEmailField() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("emailField");
	}
	public static String getCommandField() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("commandField");
	}
	public static String getCaptchaEnter() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("captchaEnter");
	}
	public static String getRedName() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("redName");
	}
	public static String getRedCompany() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("redCompany");
	}
	public static String getRedUrl() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("redUrl");
	}
	public static String getRedEmail() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("redEmail");
	}
	public static String getRedPhone() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("redPhone");
	}
	public static String getRedUserCity() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("redUserCity");
	}
	public static String getRedQuery() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("redQuery");
	}
	public static String getIssueField() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("issueField");
	}
	public static String getReSellerLoginId() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("reSellerLoginId");
	}
	public static String getReSellerFirstName() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("reSellerFirstName");
	}
	public static String getReSellerLastname() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("reSellerLastname");
	}
	public static String getReSellerCity() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("reSellerCity");
	}
	public static String getReSellerPhoneNumber() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("reSellerPhoneNumber");
	}
	public static String getReSellerAboveText() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("reSellerAboveText");
	}
	public static String getPanelEmail() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("panelEmail");
	}
	public static String getPanelPassword() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("panelPassword");
	}
			
	public static String getPanelCaptcha() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("panelCaptcha");
	}
	public static String getForgotUsername() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("forgotUsername");
	}
	public static String getUserEmail() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("userEmail");
	}
	public static String getUserPassword() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("userPassword");
	}
	public static String getPanelUsername() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("panelUsername");
	}
	public static String getPanelAboveText() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("panelAboveText");
	}
	public static String getServiceMailId() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("serviceMailId");
	}
	public static String getServicePassword() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("servicePassword");
	}
	public static String getPanelPassword2() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("panelPassword2");
	}
	public static String getWarningMessage() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("warningMessage");
	}
	public static String getScreenshotPath() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("screenshotPath");
	}
	public static String getReportsPath() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("reportsPath");
	}
	public static String getExcelPath() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("excelPath");
	}
	public static String getExcelSheetName() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("excelSheetName");
	}
	public static String getExcelSheetName2() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("excelSheetName2");
	}
	public static String getExcelSheetName3() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("excelSheetName3");
	}
	public static String getExcelSheetName4() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("excelSheetName4");
	}
	public static String getExcelSheetName5() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("excelSheetName5");
	}
	public static String getExcelSheetName6() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("excelSheetName6");
	}
	public static String getExcelSheetName7() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("excelSheetName7");
	}
	public static String getExcelSheetName8() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("excelSheetName8");
	}
	public static String getExcelSheetName9() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("excelSheetName9");
	}
	public static String getExcelSheetName10() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("excelSheetName10");
	}
	public static String getExcelSheetName11() {
		PropertiesReader reader = new PropertiesReader(".\\src\\test\\resources\\Red.properties");
		return reader.getProperty("excelSheetName11");
	}
	
}
