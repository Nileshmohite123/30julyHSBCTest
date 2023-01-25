package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3 {

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
		
		String DOB="22/4/2020";
		
		String Date[]=DOB.split("/");
		//0-22
		//1-4
		//2-2020
	//	Listbox(Day, "22");
	//	Listbox(Month, "4");
	//	Listbox(Year, "2020");
		
		Listbox(Day, Date[0]);
		Listbox(Month, Date[1]);
		Listbox(Year, Date[2]);
	}
	public static void Listbox(WebElement element,String value) {
		Select select1 =new Select(element);
		List<WebElement>v1=select1.getOptions();
		
		for(int i=0;i<v1.size();i++) {
			
			System.out.println(v1.get(i).getText());
			
			if(v1.get(i).getText().equals(value)) {
				v1.get(i).click();
				
			}
		}
	}

}
