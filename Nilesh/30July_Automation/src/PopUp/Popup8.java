package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup8 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\abc\\\\Desktop\\Emp.xlsx");
		
		Thread.sleep(2000);
		driver.findElement(By.id("file-submit")).click();
		
		boolean b=driver.findElement(By.xpath("//h3[contains(text(),\"File Uploaded!\")]")).isDisplayed();
	
		System.out.println(b);
		
		String str=driver.findElement(By.xpath("//h3[contains(text(),\"File Uploaded!\")]")).getText();
	System.out.println(str);
	}

}
