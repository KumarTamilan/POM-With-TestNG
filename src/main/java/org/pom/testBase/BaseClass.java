package org.pom.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pom.testBase.Constants;
import org.pom.testBase.OptionsFactory;

public class BaseClass {

	public static WebDriver driver;
	
	public static void browserLaunch(String browser,String... arguments) {
		if(browser.equalsIgnoreCase(Constants.getBrowser1())) {
			driver = new ChromeDriver( OptionsFactory.chromeOptions(arguments));
		}
		else if(browser.equalsIgnoreCase(Constants.getBrowser2())) {
			driver = new FirefoxDriver( OptionsFactory.firefoxOptions(arguments));
		}
		else if(browser.equalsIgnoreCase(Constants.getBrowser3())) {
			driver = new EdgeDriver( OptionsFactory.edgeOptions(arguments));
		}
		else {
			System.out.println(Constants.getWarningMessage());
			throw new IllegalArgumentException();
		}
	}
}
