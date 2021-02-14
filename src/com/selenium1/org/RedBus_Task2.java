package com.selenium1.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBus_Task2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mani\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("Chennai");
		
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Bangalore");
		
		Thread.sleep(5000);
		driver.quit();
}
}