package WebelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("Nilesh");
		Thread.sleep(2000);
		email.clear();
		email.sendKeys("mohite");
		Thread.sleep(2000);
		
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("1233");
		
		pass.clear();
		Thread.sleep(2000);
		pass.sendKeys("NGHGFG");
	}

}
