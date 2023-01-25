package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Nilesh@123");
		driver.findElement(By.id("pass")).sendKeys("Nilesh@123");
		//driver.findElement(By.xpath("//div[@class=\"_9lsa\"]")).click();
		//driver.findElement(By.id("u_0_5_jf")).click();
		// xpath by contains by attribute
		driver.findElement(By.xpath("//button[contains(@id,\"u_0_5_\")]")).click();
	}

}
