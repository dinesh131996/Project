package com.selenium1.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter_Task6 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mani\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://twitter.com/login");
	Thread.sleep(4000);
	WebElement twitterid = driver.findElement(By.xpath("//input[@name='session[username_or_email]']"));
	twitterid.sendKeys("Dinesh01031");

WebElement passcode = driver.findElement(By.xpath("//input[@name='session[password]']"));
passcode.sendKeys("ghfghh");

Thread.sleep(5000);
driver.quit();
}
}
