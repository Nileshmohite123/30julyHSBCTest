package WindowHandle;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String path="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(path);
		
		driver.findElement(By.xpath("//a[@href=\"https://twitter.com/orangehrm?lang=en\"]")).click();
		
		Set<String>windowid=driver.getWindowHandles();
		System.out.println(windowid);
		
		Iterator<String> it=windowid.iterator();
		
		String parantwindow=it.next();
		System.out.println(parantwindow);
		
		String childwindow=it.next();
		System.out.println(childwindow);
		
		driver.switchTo().window(childwindow);
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.switchTo().window(parantwindow);
		String title1=driver.getTitle();
		System.out.println(title1);
	}

}
