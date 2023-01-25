package PracticeListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
	static WebDriver driver;
	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "c://Installer//chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		String s1="//div[@class=\"comboTreeDropDownContainer\"]//li";
		m1(s1, "choice 5");
		String s2="//div[@id=\"comboTree269920DropDownContainer\"]//li";
		m1(s2, "choice 3");
		String s3="//div[@id=\"comboTree543161DropDownContainer\"]//li";
		
		
		//m1(s1, "choice 5");
	//	m1(s2, "choice 3");
				
		m1(s3, "choice 3");
				
			
	}
	public static void  m1(String element, String value) {
		
		List<WebElement>v1=driver.findElements(By.xpath(element));
		
		System.out.println(v1.size());
		
		for(int i=0;i<v1.size();i++) {
			
			System.out.println(v1.get(i).getText());
			
			if(v1.get(i).getText().equals(value)) {
				v1.get(i).click();
			}
		}
	}

}
