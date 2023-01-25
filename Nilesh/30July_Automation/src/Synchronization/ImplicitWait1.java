package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait1 {

	public static void main(String[] args) {

		
System.setProperty("webdriver.chrome.driver", "c://Installer//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		String BaseUrl="https://www.facebook.com/";
		driver.get(BaseUrl);
		
		driver.findElement(By.id("email")).sendKeys("Nilesh");
		driver.findElement(By.id("pass")).sendKeys("Mohite");
		
		
		
	}

}
