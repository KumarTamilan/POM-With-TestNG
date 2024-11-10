package org.javacode;

public class EdgeBrowser implements WebBrowser{

	public void maximize() {
		System.out.println("This Method is used to Maximize the EdgeBrowser");
	}

	public void minimize() {
		System.out.println("This Method is used to Minimize the EdgeBrowser");
	}
	
	public static void main(String[] args) {
		WebBrowser chrome = new ChromeBrowser();
		chrome.maximize();
		WebBrowser firefox = new FirefoxBrowser();
		firefox.maximize();
		WebBrowser edge = new EdgeBrowser();
		edge.maximize();
		System.out.println(a);
		WebBrowser.m1();
		
		
	}

}
