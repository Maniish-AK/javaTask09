package javaTask09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qsn03 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		WebElement searchInput = driver.findElement(By.xpath("//input[@id='searchInput']"));
        searchInput.sendKeys("Artificial Intelligence");
        WebElement searchButton = driver.findElement(By.className("pure-button"));
        searchButton.click();
        Thread.sleep(2000);
        WebElement historySectionLink = driver.findElement(By.linkText("History"));
        historySectionLink.click();
        String sectionTitle = driver.getTitle();
        System.out.println("Title of the section: " + sectionTitle);
        driver.close();

	}

}
