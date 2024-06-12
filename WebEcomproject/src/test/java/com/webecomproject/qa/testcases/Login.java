package com.webecomproject.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	@Test
	public void verifyLoginWithValidCredential() {
		
		// Set up Chrome options if needed
        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--remote-allow-origins=*");

        // Use WebDriverManager to manage Chrome driver
        WebDriverManager.chromedriver().setup();
        
        // Instantiate Chrome WebDriver with service and options
        WebDriver driver = new ChromeDriver(chromeOptions);
        
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
		
		
	}

}
