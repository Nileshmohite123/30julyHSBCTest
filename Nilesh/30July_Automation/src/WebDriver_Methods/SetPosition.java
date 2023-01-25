package WebDriver_Methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\\\Installer\\\\chromedriver.exe");
		
		//step2
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		Thread.sleep(5000);
		
		String Title=driver.getTitle();
		System.out.println(Title);
		System.out.println(driver.manage().window().getSize());
		
		Dimension Size=new Dimension(300, 500);
		Point po=new Point(500, 200);
		Thread.sleep(5000);
		driver.manage().window().setPosition(po);
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(5000);
		driver.quit();


	}

}
