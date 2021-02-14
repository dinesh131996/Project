package com.selenium1.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Icici_task5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Mani\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(
				"https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		Thread.sleep(10000);
		WebElement icici = driver.findElement(By.id("DUMMY1"));
		icici.sendKeys("Chennai");

		WebElement button = driver.findElement(By.id("DUMMY23"));
		button.click();

		WebElement mobnum = driver.findElement(By.id("AuthenticationFG.RIB_LOGIN_MOBILE"));
		mobnum.sendKeys("5555555");

		Thread.sleep(20000);
		driver.quit();
	}

}
