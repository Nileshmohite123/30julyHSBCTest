package IFRrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		driver.switchTo().frame("iframeResult");
		
		driver.switchTo().frame(0);
		
	String text=	driver.findElement(By.xpath("//h1[contains(text(),\"This page is displayed in an iframe\")]")).getText();
	System.out.println(text);
	
	driver.switchTo().parentFrame();
	boolean b=driver.findElement(By.xpath("//p[contains(text(),\"You can use the height and width\")]")).isDisplayed();
	System.out.println(b);
	
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[@href=\"/default.asp\"]")).click();
	}

}
