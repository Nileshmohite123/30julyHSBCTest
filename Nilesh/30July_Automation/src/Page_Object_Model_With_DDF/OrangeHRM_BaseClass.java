package Page_Object_Model_With_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page_Object_Model_Without_DDF.OrangeHrm_LoginPage;

public class OrangeHRM_BaseClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String path="C:\\Users\\abc\\Documents\\OrangeHrmUsername.xlsx";
		FileInputStream File=new FileInputStream(path);
		
		Sheet sh=WorkbookFactory.create(File).getSheet("Sheet1");
		
	
		
		//Create the object of the OrangeHRM_LoginPage class
		OrangeHRM_LoginPage1  OL=new OrangeHRM_LoginPage1(driver);
		String Name1=sh.getRow(1).getCell(0).getStringCellValue();
		OL.UserName1(Name1);
		String pass=sh.getRow(1).getCell(1).getStringCellValue();
		OL.PasswordNew1(pass);
		OL.Loginbotton1();
		
		Thread.sleep(4000);
		
	}

}
