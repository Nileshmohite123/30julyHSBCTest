package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox8 {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Nilesh");
        driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("Mohite");
        driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("AP-JINTI,TAL-PHALTAN");
        driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("mohitenilesh7522@gmail.com");
        driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("7522945996");
        driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
        driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
        driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
        
        String lang="//ul[@class=\"ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all\"]//li";
        Selectdropdown(lang,"English");
        
     Thread.sleep(2000);
        
      
     String Day="//select[@id=\"daybox\"]//option";
	String Month="(//select[@type=\"text\"])[4]//option";
	String Year="//select[@id=\"yearbox\"]//option";
	
	
	 String DOB="8/June/1923";
		String date[]=DOB.split("/");
		
		Selectdropdown(Day,date[0]);
		Selectdropdown(Month,date[1]);
		Selectdropdown(Year,date[2]);
		
		driver.findElement(By.xpath("//select[@id=\"Skills\"]")).click();
		    String skills="//select[@id=\"Skills\"]//option";
		     Selectdropdown(skills, "APIs");
	}
	
		
		public static void Selectdropdown(String element, String value) {
		List<WebElement>v1=driver.findElements(By.xpath(element));
		System.out.println(v1.size());
		for(int i=0;i<v1.size();i++) {
			System.out.println(v1.get(i).getText());
			if(v1.get(i).getText().equals(value)) {
				v1.get(i).click();
				break;
			}
		}
	}

}
