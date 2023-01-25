package Page_Object_Model_Without_DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_BaseClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Create the object of the OrangeHRM_LoginPage class
		
		OrangeHrm_LoginPage OL=new OrangeHrm_LoginPage(driver);
		OL.UserName();
		OL.PasswordNew();
		OL.Loginbotton1();
		
		Thread.sleep(4000);
		
		OrangHrm_Dashboard OD=new OrangHrm_Dashboard(driver);
		OD.Name();
		OD.MyAction1();
		
		Thread.sleep(4000);
		
		OrangeHRM_MyInfoPage OM=new OrangeHRM_MyInfoPage(driver);
		OM.Myinfo1();
		Thread.sleep(3000);
		OM.PersonalDetails1();
		OM.middlename();
		OM.SaveButton1();
		
		Thread.sleep(3000);
		OM.ContactDetails1();
		OM.EmergencyContact1();
		
		
	}

}
