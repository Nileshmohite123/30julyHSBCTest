package Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {
static WebDriver driver;
	public static void main(String[] args) {

		
System.setProperty("webdriver.chrome.driver", "c://Installer//chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		String BaseUrl="https://www.redbus.in/";
		driver.get(BaseUrl);
		
		By input1=By.id("src");
		WaitForElement(driver, input1, 10).sendKeys("pune");
		
		By input2=By.id("dest");
		WaitForElement(driver, input2, 10).sendKeys("Mumbai");
		
		
		By input3=By.id("onward_cal");
		WaitForElement(driver, input3, 10).click();
	}
	
	public static WebElement WaitForElement(WebDriver driver, By Locator, int timeout) {
		WebDriverWait MyWait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		MyWait.until(ExpectedConditions.presenceOfElementLocated(Locator));
		
		return driver.findElement(Locator); //method give return findelement return type webelement thats
		                                    //why void replae with WebElement keyword
	}

}
