package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptSendkeys {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "c://Installer//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
	WebElement input1=	driver.findElement(By.id("email"));
	WebElement input2=	driver.findElement(By.id("pass"));
		
	WebElement login=	driver.findElement(By.xpath("//button[@name=\"login\"]"));
	
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].value='Nilesh';", input1);
	js.executeScript("arguments[0].value='Mohite';", input2);
	js.executeScript("arguments[0].click()", login);
	
		
	}

}
