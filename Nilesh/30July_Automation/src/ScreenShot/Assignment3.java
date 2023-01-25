package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Assignment3 {

static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		
	 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		Screenshot("Zeroda");
		Screenshot("ABC");
		Screenshot("XYz");
		
	}
	
	public static void  Screenshot(String Imagename) throws IOException, InterruptedException {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Random=RandomString.make(3);
		
		
		
		File Dest=new File("C:\\Users\\abc\\eclipse-workspace\\30July_Automation\\Screenshot\\"+Imagename+" "+Random+".png");
		
		FileHandler.copy(source, Dest);
		
		Thread.sleep(2000);
		
		//driver.quit();
	}

}
