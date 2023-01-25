package PracticeListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBoxWithoutDSelectClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c://Installer//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("pune");
		Thread.sleep(2000);
		
		List<WebElement>City=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		System.out.println("Total City:"+City.size());
		
		for(int i=0;i<City.size();i++) {
			
			System.out.println(City.get(i).getText());
			
			if(City.get(i).getText().equals("Wakad, Pune")) {
				City.get(i).click();
				break; //without break exception StaleElementReferenceException
			}
		}
		
		driver.findElement(By.id("dest")).sendKeys("mumbai");
		Thread.sleep(2000);
		List<WebElement>DestCity= driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
	     
		System.out.println("Total DestCity:"+DestCity.size());
		
		for(int i=0;i<DestCity.size();i++) {
			
			System.out.println(DestCity.get(i).getText());
			
			if(DestCity.get(i).getText().equals("Sion, Mumbai")) {
				
				DestCity.get(i).click();
				break;
			}
		}
	}

}
