package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsByAttribute {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();  //upcasting
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@type,\"text\")]")).sendKeys("Nilesh");
		driver.findElement(By.xpath("//input[contains(@type,\"password\")]")).sendKeys("Pass@123");

	}

}
