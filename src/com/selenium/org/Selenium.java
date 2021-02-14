package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public  class Selenium {
	public static void seleniu() {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mani\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
 WebDriver k = new ChromeDriver();
 k.get("https://www.selenium.dev/downloads/");
	}
	
	/*
	 * public static void sele() { System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\Mani\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
	 * WebDriver l = new FirefoxDriver(); l.get("https://www.facebook.com/");
	 * 
	 * 
	 * }
	 */
	public static void hike() {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Mani\\eclipse-workspace\\Selenium\\Driver\\IEDriverServer.exe");
		WebDriver ll = new InternetExplorerDriver();
		ll.get("https://www.microsoft.com/en-us/edge?form=MA13DH&OCID=MA13DH&osmjv=6&osmnv=3&mkt=en-us&anhins=0&cons=1");// TODO Auto-generated method stub

	}
public static void main(String[] args) {
	seleniu();
	hike();

	//sele();
}
}
