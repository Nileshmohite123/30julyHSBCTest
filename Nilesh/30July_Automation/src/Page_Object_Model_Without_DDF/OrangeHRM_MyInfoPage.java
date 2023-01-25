package Page_Object_Model_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_MyInfoPage {
	
	@FindBy(xpath="//a[@href=\"/web/index.php/pim/viewMyDetails\"]")
	public WebElement Myinfo;
	
	@FindBy(xpath="//a[contains(text(),\"Personal Details\")]")
	public WebElement PersinalDetails;
	
	
	@FindBy(xpath="//input[@name=\"middleName\"]")
	public WebElement MiddleName;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	public WebElement Savebutton;
	
	@FindBy(xpath="//a[contains(text(),\"Contact Details\")]")
	public WebElement ContactDetails;
	
	@FindBy(xpath="//a[contains(text(),\"Emergency Contacts\")]")
	public WebElement EmergencyContact;
	
	@FindBy(xpath="//a[contains(text(),\"Dependents\")]")
	public WebElement Dependents;
	
	public OrangeHRM_MyInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Myinfo1() {
		Myinfo.click();
	}
	
	public void PersonalDetails1() {
		String text=PersinalDetails.getText();
		System.out.println(text);
		boolean b=PersinalDetails.isDisplayed();
		System.out.println(b);
	}

	public void middlename() {
		MiddleName.sendKeys("ABC");
	}
	
	public void SaveButton1() {
		Savebutton.click();
	}
	
	public void ContactDetails1() {
		boolean b=ContactDetails.isDisplayed();
		System.out.println(b);
	}
	
	public void EmergencyContact1() {
		boolean b=EmergencyContact.isDisplayed();
		System.out.println(b);
	}
}


	
	


