package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Nilesh@123");
		driver.findElement(By.name("pass")).sendKeys("Nilesh@123");
		driver.findElement(By.xpath("//div[@class=\"_9lsa\"]")).click();
		driver.findElement(By.name("login")).click();
		
	}

}
