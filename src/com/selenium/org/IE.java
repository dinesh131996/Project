package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Mani\\eclipse-workspace\\Selenium\\Driver\\IEDriverServer.exe");
	WebDriver ll = new InternetExplorerDriver();
	ll.get("https://www.microsoft.com/en-us/edge?form=MA13DH&OCID=MA13DH&osmjv=6&osmnv=3&mkt=en-us&anhins=0&cons=1");
	}

}
