package WindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass2 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String ParantWindows=driver.getWindowHandle();
		System.out.println(ParantWindows);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]")).click();
         Thread.sleep(2000);
         
		driver.switchTo().window(ParantWindows);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href=\"https://www.facebook.com/OrangeHRM/\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().window(ParantWindows);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"https://twitter.com/orangehrm?lang=en\"]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(ParantWindows);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"https://www.youtube.com/c/OrangeHRMInc\"]")).click();
			 Set<String>  WinID=driver.getWindowHandles();
	//System.out.println(WinID);
	 Iterator<String> it=WinID.iterator();
	 
	String ParantWindow= it.next();
	System.out.println("ParantWindowId:"+ParantWindow);
	
	String LinkedinWindow=it.next();
	System.out.println("LinkedinWindowID:"+LinkedinWindow);
	
	String FacebookWindow=it.next();
	System.out.println("FacebookWindowID:"+FacebookWindow);
	
	String TwitterWindow=it.next();
	System.out.println("TwitterWindowID:"+TwitterWindow);
	
	String YoutubeWindow=it.next();
	System.out.println("YoutubeWindowID:"+YoutubeWindow);
	
	Thread.sleep(2000);
	String LinkedinTitle=driver.switchTo().window(LinkedinWindow).getTitle();
	System.out.println("LinkedInTitle:"+LinkedinTitle);
	
	Thread.sleep(2000);
	String FacebookWindowTitlte=driver.switchTo().window(FacebookWindow).getTitle();
	System.out.println("FacebookWindowTitle:"+FacebookWindowTitlte);
	
	Thread.sleep(2000);
	String TwitterWindowTitlte=driver.switchTo().window(TwitterWindow).getTitle();
	System.out.println("TwitterWindowTitle:"+TwitterWindowTitlte);
	
	Thread.sleep(2000);
	String YoutubeWindowTitlte=driver.switchTo().window(YoutubeWindow).getTitle();
	System.out.println("YoutubeWindowTitle:"+YoutubeWindowTitlte);
	
	Thread.sleep(2000);
	String Paranttitle=driver.switchTo().window(ParantWindow).getTitle();
	System.out.println("ParantWindowTitle:"+Paranttitle);
	
	driver.quit();
	}

}
