package org.pom.testBase;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OptionsFactory {

	public static ChromeOptions chromeOptions(String... arguments) {
		return new ChromeOptions().addArguments(arguments);
	}
	public static FirefoxOptions firefoxOptions(String... arguments) {
		return new FirefoxOptions().addArguments(arguments);
	}
	public static EdgeOptions edgeOptions(String... arguments) {
		return new EdgeOptions().addArguments(arguments);
	}
}
