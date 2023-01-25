package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox5 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("pune");
		
		Thread.sleep(5000);
		List<WebElement>City=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		
		System.out.println("Total count"+City.size());
		
		
		for(int i=0;i<City.size();i++) {
			City.get(i).getText();
			System.out.println(City.get(i).getText());
			
			//select specific values
			if(City.get(i).getText().equals("Bhosari, Pune")) {
				City.get(i).click();
			break;
			}
		}
		
		driver.findElement(By.id("dest")).sendKeys("Mumbai");
		Thread.sleep(3000);

        List<WebElement> DestCity= driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));		
	
        System.out.println("Totasl city count :"+DestCity.size());
		Thread.sleep(2000);

        for(int i=0 ;i<DestCity.size();i++) {
           System.out.println(DestCity.get(i).getText());  
           if(DestCity.get(i).getText().equals("Borivali West, Mumbai")) {
               System.out.println("Selected Dest city :"+DestCity.get(i).getText());  

        	   DestCity.get(i).click();
        	   break;

           }
        }
			
			driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//td[@class=\"current day\"]")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.id("search_btn")).click();
			
			Thread.sleep(3000);

	}
}
