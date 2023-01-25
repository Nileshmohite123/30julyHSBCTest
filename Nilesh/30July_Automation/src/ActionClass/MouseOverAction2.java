package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction2 {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "c://Installer//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(3000);
		
	WebElement button=	driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
	
	Actions Act=new Actions(driver);
	
	Act.contextClick(button).build().perform();
	Thread.sleep(3000);

	driver.findElement(By.xpath("	(	//span[contains(text(),\"Copy\")])[2]")).click();
	Thread.sleep(3000);
	
	String str=driver.switchTo().alert().getText();
	System.out.println(str);
	
	driver.switchTo().alert().dismiss();
	Thread.sleep(3000);

	
	}

}
