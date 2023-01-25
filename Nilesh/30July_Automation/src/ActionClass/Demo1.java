package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	WebElement uname=	driver.findElement(By.id("email"));
	WebElement pname=	driver.findElement(By.id("pass"));
	
	uname.sendKeys("Nilesh");
	
	Actions act=new Actions(driver);
	
	act.keyDown(Keys.CONTROL);
	act.sendKeys("a");
	act.sendKeys("c");
	act.keyUp(Keys.CONTROL);
	act.build().perform();
	
	
	act.sendKeys(Keys.TAB).build().perform();
	
	act.keyDown(Keys.CONTROL);
	act.sendKeys("v");
	act.keyUp(Keys.CONTROL);
	act.build().perform();
	
	
	String user=uname.getAttribute("value");
	System.out.println(user);
	String pass=pname.getAttribute("value");
	System.out.println(pass);
	
	if(user.equals(pass)) {
		System.out.println("correct text");
	}
	else {
		System.out.println("Incorrect text");
	}
		
		
	}

}
