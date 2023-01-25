package PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popup7 {

	public static void main(String[] args) {

		
		ChromeOptions option=new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
	}

}
