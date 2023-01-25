package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup9 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String BaseURL = "https://demoqa.com/browser-windows";
		driver.get(BaseURL);
		
		driver.findElement(By.id("windowButton")).click();
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		String ParantWindow=driver.getWindowHandle();//current window
		
		Set<String>ChildWindows=driver.getWindowHandles();
		System.out.println(ParantWindow);
		for(String ChildWindow:ChildWindows) {
			System.out.println(ChildWindow);
			if(!ParantWindow.equalsIgnoreCase(ChildWindow)){
				
				driver.switchTo().window(ChildWindow);
				driver.manage().window().maximize();
				Thread.sleep(5000);
				
			String text=	driver.findElement(By.xpath("//h1[contains(text(),\"This is a sample page\")]")).getText();
			System.out.println(text);
			
			driver.close();
			}
		}
		
		Thread.sleep(2000);
		
		driver.switchTo().window(ParantWindow);
		
	String text=	driver.findElement(By.xpath("//div[contains(text(),\"Browser Windows\")]")).getText();
	System.out.println(text);
	}

}
