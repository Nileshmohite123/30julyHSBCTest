package Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait1 {

	public static void main(String[] args) {

		
System.setProperty("webdriver.chrome.driver", "c://Installer//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		String BaseUrl="https://www.redbus.in/";
		driver.get(BaseUrl);
		
		WebDriverWait MyWait=new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement element=MyWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("src")));
		
		element.sendKeys("pune");
		
		
WebElement element1=MyWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dest")));
		
		element1.sendKeys("mumbai");
		
	}

}
