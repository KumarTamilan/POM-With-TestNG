package org.pom.testRunner;

import org.pom.testBase.BaseClass;
import org.pom.testBase.Constants;
import org.pom.testBase.DataGenerator;
import org.pom.testUtilities.DriverHelper;
import org.pom.testUtilities.ExcelHelper;
import org.pom.testUtilities.PageInstance;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestRunnerClass extends BaseClass{

	PageInstance getInstance;
	ExcelHelper excel;
	ExcelHelper excel1;
	ExcelHelper excel2;
	ExcelHelper excel3;
	ExcelHelper excel4;
	ExcelHelper excel5;
	ExcelHelper excel6;
	ExcelHelper excel7;
	ExcelHelper excel8;
	ExcelHelper excel9;
	
	@BeforeClass()
	public void setup() {
		getInstance = new PageInstance();
		excel = new ExcelHelper(Constants.getExcelPath(),Constants.getExcelSheetName2());
		excel1 = new ExcelHelper(Constants.getExcelPath(),Constants.getExcelSheetName3());
		excel2 = new ExcelHelper(Constants.getExcelPath(),Constants.getExcelSheetName4());
		excel3 = new ExcelHelper(Constants.getExcelPath(),Constants.getExcelSheetName5());
		excel4 = new ExcelHelper(Constants.getExcelPath(),Constants.getExcelSheetName6());
		excel5 = new ExcelHelper(Constants.getExcelPath(),Constants.getExcelSheetName7());
		excel6 = new ExcelHelper(Constants.getExcelPath(),Constants.getExcelSheetName8());
		excel7 = new ExcelHelper(Constants.getExcelPath(),Constants.getExcelSheetName9());
		excel8 = new ExcelHelper(Constants.getExcelPath(),Constants.getExcelSheetName10());
		excel9 = new ExcelHelper(Constants.getExcelPath(),Constants.getExcelSheetName11());
		browserLaunch(Constants.getBrowser1(),Constants.getStartMaximized());
		DriverHelper.implicitWait(15);
		DriverHelper.getUrl(Constants.getUrl());
	}
	@Test(priority = 1)
	public void tc_001() {
		DriverHelper.getPageTitle();
	}
	@Test(priority = 2)
	public void tc_002() {
		DriverHelper.getPageCurrentUrl();
	}
	
	
	@Test(priority = 3,dataProvider = "qaTestData",dataProviderClass = DataGenerator.class)
	public void tc_003(String username2,String password2) {
		
		getInstance.getRediffMailModule().rediffMailModule(username2,password2);
		
	}
	@Test(priority = 4,dataProvider = "qaTestData1",dataProviderClass = DataGenerator.class)
	public void tc_004(String fullName2,
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
		
		
		getInstance.getCreateNewAccountModule().createNewAccountModule(fullName2, mailId2, 
				accountPassword2, reTypePassword2, alternateEmail2, allCountries2, recoverPassword2, 
				allDays2, allMonths2, allYears2, allCountry2, enterCaptcha2);
		
	}
	@Test(priority = 5,dataProvider = "qaTestData2",dataProviderClass = DataGenerator.class)
	public void tc_005(String nameField2,String emailField2,String commentField2,String captchaEnter2) {
		
		getInstance.getPolicyModule().policyModule(nameField2, emailField2, commentField2, captchaEnter2);
		
	}
	@Test(priority = 6,dataProvider = "qaTestData3",dataProviderClass = DataGenerator.class)
	public void tc_006(String redName2,String redCompany2,String redUrl2,String redEmail2,
			  String redPhone2,String redUserCity2,String redQuery2) {
		
		getInstance.getAdvertiseModule().advertiseModule(redName2, redCompany2, redUrl2, redEmail2, redPhone2, redUserCity2, redQuery2);
		
	}
	@Test(priority = 7,dataProvider = "qaTestData4",dataProviderClass = DataGenerator.class)
	public void tc_007(String issueField2) {
		
		getInstance.getPrivacyModule().privacyModule(issueField2);
		
	}
	@Test(priority = 8,dataProvider = "qaTestData5",dataProviderClass = DataGenerator.class)
	public void tc_008(String reSellerLoginId2,String reSellerFirstName2,
			String reSellerLastName2,String reSellerCity2,String reSellerPhoneNumber2,
			String reSellerAboveText2) {
		
		getInstance.getBecomeAResellerModule().becomeAResellerModule(reSellerLoginId2, reSellerFirstName2, reSellerLastName2, reSellerCity2, reSellerPhoneNumber2, reSellerAboveText2);
		
	}
	@Test(priority = 9,dataProvider = "qaTestData6",dataProviderClass = DataGenerator.class)
	public void tc_009(String panelEmail2,String panelPassword2,String panelCaptcha2) {
		
		getInstance.getBuyNowModule().buyNowModule(panelEmail2, panelPassword2, panelCaptcha2);
		
	}
	@Test(priority = 10,dataProvider = "qaTestData7",dataProviderClass = DataGenerator.class)
	public void tc_010(String forgotUserName2,String userEmail2,String userPassword2) {
		
		getInstance.getSignInModule().signInModule(forgotUserName2, userEmail2, userPassword2);
		
	}
	@Test(priority = 11,dataProvider = "qaTestData8",dataProviderClass = DataGenerator.class)
	public void tc_011(String panelUsername2,String panelPassword22,String panelAboveText2) {

		getInstance.getUserPanelModule().userPanelModule(panelUsername2, panelPassword22, panelAboveText2);
		
	}
	@Test(priority = 12,dataProvider = "qaTestData9",dataProviderClass = DataGenerator.class)
	public void tc_012(String serviceMailId2,String servicePassword2) {
		
		getInstance.getUserServiceModule().userServiceModule(serviceMailId2, servicePassword2);
		
		DriverHelper.wait(2000);
		DriverHelper.takeTheScreenshotOnMultipleTimes("UserServiceModule");
	}
	@AfterClass
	public void tearDown() {
		DriverHelper.driverClose();
	}
}
