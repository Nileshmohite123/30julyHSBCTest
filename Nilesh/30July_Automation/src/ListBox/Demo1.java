package ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {
static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		
		 driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("pune");
		
		String City1="//ul[@class=\"autoFill homeSearch\"]//li";
		Listbox(City1, "Wakad, Pune");
		
		driver.findElement(By.id("dest")).sendKeys("Mumbai");
		String City2="//ul[@class=\"autoFill homeSearch\"]//li";
	

//Listbox(City1, "Wakad, Pune");
Listbox(City2, "Sion, Mumbai");
		
	}
	
	public static void Listbox(String element, String value) {
		
		List<WebElement>Listday=driver.findElements(By.xpath(element));
		System.out.println(Listday.size());
		
		for(int i=0;i<Listday.size();i++) {
			System.out.println(Listday.get(i).getText());
			if(Listday.get(i).getText().equals(value)) {
				Listday.get(i).click();
				break;
				
			}
		}
		
	}
	

}
