package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingByElement {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "c://Installer//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement w3spaces=driver.findElement(By.xpath("//h1[contains(text(),\"W3Schools Spaces\")]"));
		
		js.executeScript("arguments[0].scrollIntoView();", w3spaces);
	}

}
