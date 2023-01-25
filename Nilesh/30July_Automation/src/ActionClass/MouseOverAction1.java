package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c://Installer//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		WebElement element=driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
	
	Actions Act=new Actions(driver);
	
	Act.moveToElement(element).build().perform();
	
	Thread.sleep(3000);
	driver.quit();
	}

}
