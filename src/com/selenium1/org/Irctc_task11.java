package com.selenium1.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc_task11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mani\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(10000);
	
		WebElement button = driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]"));
		button.click();
		
		WebElement userid = driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c58-8')]"));
		userid.sendKeys("chennai");
	
	WebElement passcode= driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c58-9')]"));
		passcode.sendKeys("salem");
		
		
		
		Thread.sleep(5000);
	driver.quit();
	}
}
