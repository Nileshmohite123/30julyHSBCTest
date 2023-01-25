package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		//step-2
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		if(URL.equals("https://www.facebook.com/")) {
			System.out.println("Correct URL");
			
		}
		else {
			System.out.println("Incorrect URL");
		}
	}

}
