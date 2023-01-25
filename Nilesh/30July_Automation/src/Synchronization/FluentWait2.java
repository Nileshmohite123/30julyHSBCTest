package Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait2 {

	public static void main(String[] args) {

		
System.setProperty("webdriver.chrome.driver", "c://Installer//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		String BaseUrl="https://www.redbus.in/";
		driver.get(BaseUrl);
		
	By input1=	By.id("src");
		
	By input2=	By.id("dest");
	WaitForFluentWait( driver, input1).sendKeys("pune");
	
	WaitForFluentWait( driver, input2).sendKeys("Mumbai");
	}
	
	
	public static WebElement WaitForFluentWait(WebDriver driver,By Source) {
		
		Wait<WebDriver> MyWait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		//Usage of fluent wait
		
		WebElement element=MyWait.until(new Function<WebDriver,WebElement>(){
			
			public WebElement apply(WebDriver driver) {
				return driver.findElement(Source);
			}
		});
		return element;
		
		
	}

}
