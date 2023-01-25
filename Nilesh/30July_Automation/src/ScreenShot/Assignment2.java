package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Assignment2 {

	public static void main(String[] args) throws IOException, InterruptedException {

System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
	WebElement element=	driver.findElement(By.xpath("//h2[text()=\"Login to Kite\"]"));
	
	File source=((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
	
String Random=	RandomString.make(3);

String Imagename="Zeroda";


File Dest=new File("C:\\Users\\abc\\eclipse-workspace\\30July_Automation\\Screenshot\\"+Imagename+" "+Imagename+".png");
	
	FileHandler.copy(source, Dest);
	
	Thread.sleep(2000);
	
	driver.quit();
	
	
	}

}
