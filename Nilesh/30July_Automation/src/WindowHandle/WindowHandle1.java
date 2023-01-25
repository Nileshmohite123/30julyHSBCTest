package WindowHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	
	    String WindowID=driver.getWindowHandle();
	    //Return if of the single browser window
	    
	    
	  //  CDwindow-E0A9A1E00300F0F23BDF71F8E3C37D9D
	    
	   // CDwindow-F7895BCB323CE88BCA850A9CE34E05FB

	    System.out.println(WindowID);
	    
	   // driver.quit();
	}

}
