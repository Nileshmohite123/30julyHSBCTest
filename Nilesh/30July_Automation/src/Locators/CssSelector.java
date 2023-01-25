package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login");
		//tagname and id
		//driver.findElement(By.cssSelector("input#username")).sendKeys("Nilesh@123");
		//driver.findElement(By.cssSelector("input#password")).sendKeys("123");
	    // tagname and class
		driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("mohitenilesh7522@gmail.com");
	    driver.findElement(By.cssSelector("input.form-control.private-form__control.login-password")).sendKeys("djhdfh");
	    driver.findElement(By.cssSelector("span.UICheckbox__PrivateCheckboxIndicator-g938e0-1.eXrqFy.private-checkbox__indicator")).click();
	
	driver.findElement(By.cssSelector("#loginBtn")).click();
	}

}
