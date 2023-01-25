package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox6 {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Nilesh");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("mohite");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("mohitenilesh7522@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("Nilesh@123");
        //step1
		String Day="//select[@id=\"day\"]//option";
		String Month="//select[@id=\"month\"]//option";
		String Year="//select[@id=\"year\"]//option";
		
	    String DOB="15-May-2020";
		String date[]=DOB.split("-");
		
		Selectdropdown(Day,date[0]);
		Selectdropdown(Month,date[1]);
		Selectdropdown(Year,date[2]);
	}
	
		
		public static void Selectdropdown(String element, String value) {
		List<WebElement>v1=driver.findElements(By.xpath(element));
		System.out.println(v1.size());
		for(int i=0;i<v1.size();i++) {
			if(v1.get(i).getText().equals(value)) {
				v1.get(i).click();
				break;
			}
		}
	}

}
