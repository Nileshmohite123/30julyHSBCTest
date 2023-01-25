package WindowHandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href=\"http://www.orangehrm.com\"]")).click();

	   Set<String> WindowID= driver.getWindowHandles();
	   
	   //Method is used to store all the opened windows id in the set data
	   
	   System.out.println(WindowID);
	   
	   
	  // Iterator
	   
	   Iterator<String> it=WindowID.iterator();
	   
	  String parantwindow= it.next();
	  
	  System.out.println("ParantWindow:"+parantwindow);
	  
	  
	  String childwindow=it.next();
	  
	  System.out.println("ChildWindow"+childwindow);
	  
	  //second way using array list
	  
	  
	  ArrayList<String> winlist=new ArrayList<String>(WindowID);
	  
	 String ParantWindow= winlist.get(0);
	 
	 System.out.println("ParantWindow"+ParantWindow);
	 
	String ChildWindow= winlist.get(1);
	System.out.println("ChildWindow"+ChildWindow);
	
	
	driver.switchTo().window(ChildWindow);
	
	driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("Nilesh@123");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name=\"action_submitForm\"]")).click();
	
	}

}
