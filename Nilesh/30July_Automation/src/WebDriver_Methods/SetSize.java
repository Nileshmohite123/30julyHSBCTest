package WebDriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\\\Installer\\\\chromedriver.exe");
		
		//step2
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		Dimension Size=new Dimension(700, 800);
		driver.manage().window().setSize(Size);
		System.out.println(Size);
		Thread.sleep(5000);
		
		driver.quit();

		
	}

}
