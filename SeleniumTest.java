package com.selenium.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	WebDriver driver;

	@Test
	public void webdriverie() throws Exception {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		driver.get("https://www.amazon.in/");
		try {
			Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");
			} catch (IOException e) {
			e.printStackTrace();
			}
	}
	
	/*@Test
	public void webdriverff() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.quit();
	}
	
	@Test
	public void webdriverch() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.quit();
	}*/
}
