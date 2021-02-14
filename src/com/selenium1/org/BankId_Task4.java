package com.selenium1.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankId_Task4 {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mani\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.lvbankonline.in/index.html?module=login");
	Thread.sleep(20000);
	WebElement bankid = driver.findElement(By.xpath("//input[@id='login_username|input']"));
	bankid.sendKeys("doggy");
	
	Thread.sleep(5000);
	WebElement passcode = driver.findElement(By.id("login_password|input"));
	passcode.sendKeys("54321");
	Thread.sleep(5000);
	driver.quit();
}
}