package FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		//1
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		
		searchbox.sendKeys("Oneplus");
		
		Thread.sleep(2000);
		
		//2
	WebElement text=	driver.findElement(By.xpath("//a[@class=\"nav-a  \"]"));
	System.out.println(text.getText());
	
	
	WebElement link1=driver.findElement(By.xpath("//a[@class=\"nav-assd  \"]"));
	link1.click();    //no such element exception
	}
	

}
