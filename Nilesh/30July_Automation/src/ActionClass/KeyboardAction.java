package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "c://Installer//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Thread.sleep(2000);
		
		Actions Act=new Actions(driver);
		
		Thread.sleep(2000);
		
	Act.sendKeys(Keys.BACK_SPACE).build().perform();
		
	String text=	driver.findElement(By.id("result")).getText();
	System.out.println(text);
	Thread.sleep(3000);
	
	Act.sendKeys(Keys.DELETE).build().perform();
	
	String text1=	driver.findElement(By.id("result")).getText();
	System.out.println(text1);
	Thread.sleep(3000);
	
	Act.sendKeys(Keys.ENTER).build().perform();
	
	String text2=	driver.findElement(By.id("result")).getText();
	System.out.println(text2);
	Thread.sleep(3000);
	
	
Act.sendKeys(Keys.TAB).build().perform();
	
	String text3=	driver.findElement(By.id("result")).getText();
	System.out.println(text3);
	Thread.sleep(3000);
	
	driver.quit();
	}

}
