package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightBorderUsingMethod {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "c://Installer//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement element=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		WebElement input=driver.findElement(By.id("email"));
		
		WebElement input1=driver.findElement(By.id("pass"));
		
		Thread.sleep(2000);
		drawborder(element, driver);
		drawborder(input, driver);
		drawborder(input1, driver);
		
	}
	public static void drawborder(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='10px solid yellow'", element);
		js.executeScript("arguments[0].style.background='red'", element);
	}
	}


