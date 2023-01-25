package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_method {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\\\Installer\\\\chromedriver.exe");
		
		//step2
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(5000);
		String page2=driver.getTitle();
		System.out.println(page2);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.quit();


		

		
	
	}

}
