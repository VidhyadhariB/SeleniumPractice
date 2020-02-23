package com.qa.basicpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CompareTitlesEx {
	static WebDriver driver = null;
	

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\SELENIUM\\GeckoDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		String BaseURL = "https://www.getascensionmichigancare.com/?keyword=%2Bprovidence%20%2Bhospital&gclid=EAIaIQobChMI0KPa2eHm5wIVUr7ACh00hAJnEAAYASAAEgKxh_D_BwE";
		 String Expectedresult = "Online Scheduling | Ascension Michigan | Get the Care You Need";
		 String actualResult = "";
		driver.get("BaseURL");
		actualResult=driver.getTitle();		
		if(actualResult.contentEquals(Expectedresult) )
		{
			System.out.println("Test passed");
	
		}else
		{
			System.out.println("test failed");
		}
		driver.close();
		driver.quit();
	}

}
