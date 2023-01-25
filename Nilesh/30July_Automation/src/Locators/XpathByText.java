package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//1.xpath by attribute
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Nilesh@123");
		
	    driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy _9npi\"]")).sendKeys("Pass@123");
	   // driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
	    driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).click();
	}

	
	

}
