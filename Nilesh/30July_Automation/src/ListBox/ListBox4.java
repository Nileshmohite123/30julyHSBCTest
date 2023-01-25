package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ListBox4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Nilesh");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("mohite");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("mohitenilesh7522@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("Nilesh@123");
        //step1
		WebElement Day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		WebElement Month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		WebElement Year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		
		//Q-1 How will you get the total no.of size
		
		Select select1=new Select(Day);
		List<WebElement>Listday=select1.getOptions();
		System.out.println("Total Day:"+Listday.size());
	
		//How will u print all values
		for(int i=0;i<Listday.size();i++) {
			Listday.get(i).getText();
			System.out.println(Listday.get(i).getText());
			
			//how will you select specific values from dropdown
			
			if(Listday.get(i).getText().equals("14")) {
				Listday.get(i).click();
				break;
			}
		}
		// select month
		Select select2=new Select(Month);
		List<WebElement>Monthvalue=select2.getOptions();
		System.out.println("Total Months:"+Monthvalue.size());
		
		// print values in month
		for(int i=0;i<Monthvalue.size();i++) {
		String Months=	Monthvalue.get(i).getText();
			System.out.println(Months);
			//how will u select specific value in month
			if(Months.equals("May")) {
				Monthvalue.get(i).click();
					
				
			}
		}
		
		//select year
		Select select3=new Select(Year);
		List<WebElement>Yearvalue=select3.getOptions();
		System.out.println("Total Years"+Yearvalue.size());
		
		//print values in years
		for(int i=0;i<Yearvalue.size();i++) {
          String Years =Yearvalue.get(i).getText();
          System.out.println(Years);
          
          // select specific value in Year
          if(Years.equals("1999")) {
        	  Yearvalue.get(i).click();
          }
		}
		
	}

}
