package Page_Object_Model_Without_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangHrm_Dashboard {
	
	@FindBy(xpath="//p[@class=\"oxd-userdropdown-name\"]")
	public WebElement Uname;
	
	@FindBy(xpath="(//p[@class=\"oxd-text oxd-text--p\"])[4]")
    public WebElement MyAction;
	
	
	public OrangHrm_Dashboard(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void Name() {
		String text=Uname.getText();
		System.out.println(text);
		if(text.equals("Paul Collings")) {
			System.out.println("Correct text");
		}
		else {
			System.out.println("Incorret text");
		}
		
	}	
	public void MyAction1() {
		boolean myac=MyAction.isDisplayed();
		System.out.println(myac);
	}	
		
		
	
}
