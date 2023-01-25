package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Method {

	public static void main(String[] args) {

		// step-1
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		//step-2
		
		WebDriver driver=new ChromeDriver();
		
		//step-3
		
		driver.get("https://www.facebook.com/");
	}

}
