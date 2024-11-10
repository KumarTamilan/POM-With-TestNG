package org.javacode;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceptionss {

	// 1.What is Exception ? Exception Types ?
	// -Exception is like a Error.
	// -When the Exception ocuured the program the program
	// -will be terminated at the line itself.
	// Exception Two types : 1.Checked OR compile Time Exception
	// -2.UnChecked OR RunTimeException.

	// 2.How to handle Exception ?
	// -Try,Catch,Finally Block
	// -Throw,Throws Keyword

	// 3.All Exception parent ? ==>Exception
	// 4.Exception parent ? ==>Throwable
	// 5.All class parent ? ==>Object
	// 6.List,set Interface parent ? ==>Collection
	// 7.Collection Interface parent ? ==>Iterable
	// 8.chromedriver parent ? ==>ChromiumDriver
	// 9.ChromiumDriver parent ? ==>RemoteWebDriver
	// 10.FFD,ED,IED parent ? ==>RemoteWebDriver
	// 11.RemoteWebDriver parent ? ==>WebDriver
	// 12.WebDriver parent ? ==>SearchContext
	// 13.SearchContext methods ? ==>FiElement,FiElems

	// 14.How to Arithmatic Exception is coming ?
	public static void main(String[] args) {

//		int a =2;
//		int b = 0;
//		System.out.println(a/b);

//		int a[] = { 1, 2, 3, 4, 5, 6 };
//
//		System.out.println(a[6]);

// 15.How to  StringIndexOutOfBoundException is coming ?

//		String b = "";
//
//		System.out.println(b);

		// 16.How to Handle the Arithmetic Exception ?
//		int a =2;
//		int b = 0;
//		
//		try {
//			System.out.println(a/b);
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Please check the Integer value");
//			int c =10;
//			int d = 2;
//			System.out.println(c/d);
//		}

		// 17.How to Handle the ArrayIndexOutOfBoundException ?

//		int a[] = { 1, 2, 3, 4, 5, 6 };
//		
//		try {
//			System.out.println(a[6]);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("please check the Array length");
//			System.out.println(a[5]);
//		}

		// 19.Enna exception varum enru theriyaatha pothu ?
		// Whenever we create the catch(Exception e),Then it
		// it will come to last of the all Excxeption.

		// 24.How to perform Throw keyword ?
		// -1 Try,1 catch 				==>Possible
		// -Multiple Try 1 catch   ==>Not Possible
		// -1 Try Multiple catch   ==>Possible
		// -Try,catch,Finally 			==>Possible
		// -catch,Finally 				==>Not Possible
		// -Single Finally 				==>Not Possible
		//	-Only Try & Finally 		==>Possible
		//  -Without catch and only Try,Finally Possible but
		//		Exception will be not Handled and Finally block will be
		//		Executed.
		int a = 10;
		int b = 0;

		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			throw new NullPointerException("File is InCorrect");
		} finally {
			System.out.println("Always Executable");
		}
	}
}








