package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		boolean Text=driver.findElement(By.id("result")).isDisplayed();
		
		System.out.println(Text);
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
