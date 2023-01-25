package PracticeListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSelectClassWithMethod {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "c://Installer//chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("pune");
		Thread.sleep(2000);
		
		String City="//ul[@class=\"autoFill homeSearch\"]//li";
		m1(City,"Wakad, Pune");
		
		
		driver.findElement(By.id("dest")).sendKeys("mumbai");
		Thread.sleep(2000);
		String DestCity="//ul[@class=\"autoFill homeSearch\"]//li";
		
		
		m1(DestCity, "Sion, Mumbai");
		
		driver.findElement(By.id("onward_cal")).click();
		String date="//table[@class=\"rb-monthTable first last\"]//td";
		
		m1(date,"8");
	}
	
	public static void m1(String element, String value) {
		
		List<WebElement>v1=driver.findElements(By.xpath(element));
		
		for(int i=0;i<v1.size();i++) {
			
			System.out.println(v1.get(i).getText());
			
			if(v1.get(i).getText().equals(value)) {
				v1.get(i).click();
				break;
			}
		}
	}

}
