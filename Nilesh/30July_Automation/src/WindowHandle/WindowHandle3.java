package WindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href=\"http://www.orangehrm.com\"]")).click();

	   Set<String> WindowID= driver.getWindowHandles();
	   
	   Iterator<String>it=WindowID.iterator();
	   
	   String ParantWindow=it.next();
	  // System.out.println("ParantWindow:"+ParantWindow);
	   
	   String ChildWindow=it.next();
	   System.out.println("ChildWindow:"+ChildWindow);
	   
		Thread.sleep(2000);

	   driver.switchTo().window(ChildWindow);
	   
	  String title= driver.getTitle();
	  System.out.println(title);
	  
	  Thread.sleep(3000);
	  System.out.println("ParantWindow:"+ParantWindow);
	  driver.switchTo().window(ParantWindow);
	  String title1=driver.getTitle();
	  System.out.println(title1);
	  
	  Thread.sleep(2000);
	  driver.switchTo().window(ChildWindow);
	  
	  driver.findElement(By.id("Form_getForm_Email")).sendKeys("Nilesh");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("Form_getForm_action_submitForm")).click();
	}

}
