package com.selenium1.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal_Task9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mani\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		Thread.sleep(10000);
	
		WebElement userid = driver.findElement(By.id("userName"));
		userid.sendKeys("Dinesh300");
	
	//WebElement passcode= driver.findElement(By.id("password"));
		//passcode.sendKeys("Dinu550");
		
		Thread.sleep(5000);
	driver.quit();
	}

}
