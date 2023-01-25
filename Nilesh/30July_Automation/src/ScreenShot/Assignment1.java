package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Assignment1 {

	public static void main(String[] args) throws IOException, InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Random=RandomString.make(3);
		String Imagename="Zeroda";
		
		
		File Dest=new File("C:\\Users\\abc\\Desktop\\30 julyAutomation\\"+Imagename+" "+Random+".png");
		
		FileHandler.copy(source, Dest);
		
		Thread.sleep(2000);
	}

}
