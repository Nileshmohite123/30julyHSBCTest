package IFRrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIFeame4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	
		driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(0);
	
	String text1=	driver.findElement(By.xpath("//h1[contains(text(),\"This page is displayed in an iframe\")]")).getText();
	
	System.out.println(text1);
	
	
	driver.switchTo().parentFrame();
	
	String text2=driver.findElement(By.xpath("//p[contains(text(),\"You can use the height and width attributes to specify the size of the iframe:\")]")).getText();
	System.out.println(text2);
	
	Thread.sleep(3000);
	
	
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("//a[@href=\"/default.asp\"]")).click();
	
	}

}
