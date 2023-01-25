package WindowHandle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ass1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		
	Thread.sleep(2000);
	String WinId=driver.getWindowHandle();
	System.out.println("Parent window:"+WinId);
	
	Thread.sleep(3000);
	
	driver.switchTo().frame("iframeResult");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[contains(text(),\"Visit W3Schools.com!\")]")).click();
	
	Set<String>windowID=driver.getWindowHandles();
	
	System.out.println(windowID);
	
	 ArrayList<String> winlist=new ArrayList<String>(windowID);
	System.out.println("Total Windows:"+winlist.size()); 
	 
	String ParantWindow= winlist.get(0);
	System.out.println("ParantWindow:"+ParantWindow);
	
	String ChildWindow=winlist.get(1);
	System.out.println("ChildWindow:"+ChildWindow);
	
	Thread.sleep(2000);
	driver.switchTo().window(ParantWindow);
	
	String str=driver.findElement(By.id("runbtn")).getText();
	System.out.println("Parant Text:"+str);
	
	boolean b=driver.findElement(By.id("runbtn")).isDisplayed();
	System.out.println("Text Displayed:"+b);
	
	Thread.sleep(2000);
	driver.switchTo().window(ChildWindow);
	
	//String str1=driver.findElement(By.xpath("//a[@title=\"Home\"]")).getText();
	//System.out.println(str1);
	
	boolean text=driver.findElement(By.xpath("//a[@title=\"Home\"]")).isDisplayed();
	System.out.println("ChildLogoDisplayed:"+text);
	Thread.sleep(2000);
	driver.quit();
	}
	
	

}
