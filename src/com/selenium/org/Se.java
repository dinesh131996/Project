package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Se {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mani\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
	WebDriver king = new FirefoxDriver();
	king.get("https://www.facebook.com/");
	Thread.sleep(4000);
	king.get("https://www.youtube.com/watch?v=L4auw2m9W-w");
	Thread.sleep(10000);
	king.quit();
	
	}
}
