package com.example.app;

import java.time.Duration;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverManager {

	private static WebDriver driver;
	
	public static WebDriver getDriver(){
		if(null==driver) {
			driver=createDriver();
		}
		return driver;
	}
	
	private static WebDriver createDriver() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}		
}
