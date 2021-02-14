package com.selenium1.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc_Task7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mani\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(10000);
	//	WebElement hdfcid = driver.findElement(By.xpath("//input[@type='text']"));
		//hdfcid.click();
		
		WebElement hdfcid1 = driver.findElement(By.xpath("//input[@class='input_password']"));
		hdfcid1.sendKeys("jhjhg");

	Thread.sleep(5000);
	driver.quit();
	}

}
