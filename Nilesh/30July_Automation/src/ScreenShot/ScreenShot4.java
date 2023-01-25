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

public class ScreenShot4 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.get("https://www.redbus.in/");
		//Take a screenshot & copy into object
		
		WebElement Screen=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		
		File Source=((TakesScreenshot)Screen).getScreenshotAs(OutputType.FILE);
	 //   System.out.println(Source);
		
		String Random=RandomString.make(5);
		String Imagename="Facebook";
	    
	    File Dest=new File("C:\\Users\\abc\\eclipse-workspace\\30July_Automation\\Screenshot\\"+Imagename+" "+Random+".png");
	    
	    FileHandler.copy(Source, Dest);
	    
	    driver.quit();
	}

}
