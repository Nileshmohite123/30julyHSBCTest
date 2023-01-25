package IFRrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		
		driver.switchTo().frame("frame1");
		
	String text=	driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]")).getText();
	System.out.println(text);
	}

}
