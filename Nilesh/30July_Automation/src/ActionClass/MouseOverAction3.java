package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction3 {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "c://Installer//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);
		
		Actions Act =new Actions(driver);
	WebElement button=	driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
	
	Act.doubleClick(button).build().perform();
	Thread.sleep(3000);
	
	String str=driver.switchTo().alert().getText();
	System.out.println(str);
	Thread.sleep(2000);
	
	driver.switchTo().alert().accept();
	
	Thread.sleep(3000);
	
	driver.quit();
	
	}

}
