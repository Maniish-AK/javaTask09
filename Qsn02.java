package javaTask09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qsn02 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		 if (pageTitle.equals("STORE")) {
             System.out.println("Page landed on correct website");
         } else {
             System.out.println("Page not landed on correct website");
         }
		 driver.close();
		

	}

}
