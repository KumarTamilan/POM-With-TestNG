package org.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;


public class ExpectedException {
	
	//22.What is EXPECTEDEXCEPTION ?How to perofrm ?
	//		-It does not Throw the Exception.It will Hidde the Exception.
	//		-process Does not Execute But Test result will be passed.

	@Test(invocationCount = 4,invocationTimeOut = 1000,expectedExceptions = ThreadTimeoutException.class)
	private void logIn() {

		//It will Hide the Exception
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/KumarTamilan/ProjectAllStructureDetails/settings");
		
	}
}




