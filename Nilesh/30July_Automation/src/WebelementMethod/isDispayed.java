package WebelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDispayed {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		boolean b=driver.findElement(By.xpath("//button[@name=\"login\"]")).isDisplayed();
		System.out.println(b);
		Thread.sleep(2000);
		driver.quit();
	}

}
