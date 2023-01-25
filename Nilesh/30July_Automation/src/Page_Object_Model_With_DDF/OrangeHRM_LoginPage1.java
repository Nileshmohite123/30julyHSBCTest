package Page_Object_Model_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_LoginPage1 {

	
	//1.Data Member should be declared globally with access level private/public
	
	@FindBy(xpath="//input[@name=\"username\"]")
	public WebElement Username1;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement Password1;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	public WebElement Loginbutton;
	
	@FindBy(xpath="//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")
	public WebElement Forgot;
	
	//2. Initialize within a constructor with access level public using page factory
	
	public OrangeHRM_LoginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void UserName1(String Username2) {
		
		Username1.sendKeys(  Username2);
		
	}
	
   public void PasswordNew1(String PWD) {
		
		Password1.sendKeys(PWD);
		
	}
   
   public void Loginbotton1() {
		
		Loginbutton.click();
		
	}
	
	

	}
