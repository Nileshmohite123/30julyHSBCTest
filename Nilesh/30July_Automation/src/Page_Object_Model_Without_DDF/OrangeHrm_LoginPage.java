package Page_Object_Model_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrm_LoginPage {
	
	//1.Data Member should be declared globally with access level private/public
	
	@FindBy(xpath="//input[@name=\"username\"]")
	public WebElement Username;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement Password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	public WebElement Loginbutton;
	
	@FindBy(xpath="//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")
	public WebElement Forgot;
	
	//2. Initialize within a constructor with access level public using page factory
	
	public OrangeHrm_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void UserName() {
		
		Username.sendKeys("Admin");
		
	}
	
   public void PasswordNew() {
		
		Password.sendKeys("admin123");
		
	}
   
   public void Loginbotton1() {
		
		Loginbutton.click();
		
	}
	
	

}
