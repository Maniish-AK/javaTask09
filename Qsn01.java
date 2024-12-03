package javaTask09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Qsn01 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.getCurrentUrl();
		System.out.println("Current URL of page :: "+driver.getCurrentUrl());
		driver.navigate().refresh();
		System.out.println("Page reloaded");
		driver.close();		

	}

}
