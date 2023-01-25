package IFRrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIFrame1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(2000);
		
		//To swith main page to iframe page
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
        
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("tryhome")).click();
	}

}
