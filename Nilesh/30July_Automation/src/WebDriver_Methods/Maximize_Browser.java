package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_Browser {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\\\Installer\\\\chromedriver.exe");
		
		//step2
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//step-3
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		
		
		
	}

}
