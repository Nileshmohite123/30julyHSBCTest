package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot5 {
      static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
		TakeScreenshot("Facebook");
		
		TakeScreenshot("Redbus");
		
	}
	
	public static void TakeScreenshot(String Filename) throws IOException {
		File Screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Random=RandomString.make(5);
		
		File Dest=new File("C:\\Users\\abc\\eclipse-workspace\\30July_Automation\\Screenshot\\"+Filename+" "+Random+".png");
	    
		FileHandler.copy(Screen, Dest);
	}

}
