package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightBorder {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "c://Installer//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement element=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		WebElement input=driver.findElement(By.id("email"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//js.executeScript("arguments[0].style.border='10px solid red'", element);
		js.executeScript("arguments[0].style.border='10px solid yellow'", element);
		js.executeScript("arguments[0].style.border='10px solid red'", input);
	}

}
