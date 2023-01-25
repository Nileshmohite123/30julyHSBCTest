package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XPathbyattribute {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();  //upcasting
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement( By.xpath("//input[@type=\"text\"]")).sendKeys("Tom@123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class=\"inputtext _55r1 _6luy _9npi\"]")).sendKeys("@#$%!");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class=\"_9lsa\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();

	}



}
