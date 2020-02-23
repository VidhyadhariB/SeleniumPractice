package com.qa.basicpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverExample1 {
	static WebDriver driver = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\SELENIUM\\GeckoDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.USbank.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement d1 =driver.findElement(By.id("investing-nav"));
		d1.click();
		WebElement d2 =driver.findElement(By.id("navList2"));
		d2.click();
		d2();
		String d3= driver.getTitle();
		 
		System.out.println("The title1 is :"+d3);
		

		driver.close();
		driver.quit();
	}

	private static void invest() {
		// TODO Auto-generated method stub
		
	}

	private static void d1() {
		// TODO Auto-generated method stub

	}

	private static void d2() {
		// TODO Auto-generated method stub

	}

}
