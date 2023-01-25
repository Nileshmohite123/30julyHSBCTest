package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException   {

System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
		//step-2
		
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
	}

}
