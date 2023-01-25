package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathContainsByText {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@type,\"text\")]")).sendKeys("Nilesh");
		driver.findElement(By.xpath("//input[contains(@type,\"password\")]")).sendKeys("Pass@123");
        // contains by text
		driver.findElement(By.xpath("//button[contains(text(),\"Log in\")]")).click();
	}

}
