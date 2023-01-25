package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys("Nilesh");
	    
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		Alert Popup=driver.switchTo().alert();
		
	String Popupmessage=	Popup.getText();
	System.out.println("Alert message:"+Popupmessage);
	
	if(Popupmessage.equals("Please enter your password")) {
		System.out.println("Correct text");
	}
	else {
		System.out.println("Incorrect text");
	}
	
	Popup.accept();
		
		
	}

}
