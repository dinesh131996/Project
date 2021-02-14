package com.selenium1.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fb_Task1{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mani\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://www.facebook.com/");
		
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("dinesh.131996.ds@facebook");
		
		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.sendKeys("123456789");
		
		Thread.sleep(7000);
		
		driver.quit();
	}

}
