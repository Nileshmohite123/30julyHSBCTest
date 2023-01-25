package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_With_DDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException  {

System.setProperty("webdriver.chrome.driver", "c://Installer//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	   
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		FileInputStream File=new FileInputStream("C:\\Users\\abc\\Documents\\OrangeHrmUsername.xlsx");
		
		Sheet sh= WorkbookFactory.create(File).getSheet("Sheet1");
		
		String username=sh.getRow(1).getCell(0).getStringCellValue();
		
		String password=sh.getRow(1).getCell(1).getStringCellValue();
		
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
		String name=sh.getRow(1).getCell(2).getStringCellValue();
		String username1=driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
	
	if(name.equals(username1)) {
		
		System.out.println("Correct username");
	}
	
	else {
		System.out.println("Incorrect username");
		
		
	}
	
	Thread.sleep(5000);
	
	//driver.quit();
	}

}
