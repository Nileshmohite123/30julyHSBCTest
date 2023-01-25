package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup6 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//driver.switchTo().alert().sendKeys("admin");
		
		//synatx-"https://username:-passwordthe-internet.herokuapp.com/basic_auth"
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		
	String str=	driver.findElement(By.xpath("  //p[contains(text(),' Congratulations')]")).getText();
	System.out.println(str);
	
	boolean B=driver.findElement(By.xpath("  //p[contains(text(),' Congratulations')]")).isDisplayed();
	System.out.println(B);
	}

}
