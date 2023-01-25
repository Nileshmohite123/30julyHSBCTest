package IFRrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIFrame2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Nilesh");

	
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@href=\"Index.html\"]")).click();
	}

}

