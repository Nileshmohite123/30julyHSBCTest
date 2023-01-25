package MultipleLinks;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinks1 {

	public static void main(String[] args) {

		
System.setProperty("webdriver.chrome.driver", "c://Installer//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	
		driver.get("https://www.orangehrm.com/");
		
		// click on a links
		//driver.findElement(By.linkText("Today Deals")).click();
		//driver.findElement(By.linkText("Coupons")).click();
		
		
		//How many links are present on WebPage
		
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		
		System.out.println("Number of links present:"+Links.size());
		
		//Print all the links
		
//
//           for(WebElement link:Links) {
	//		System.out.println(link.getText());
		//	System.out.println(link.getAttribute("href"));
	//	}
		
		//using for loop
		
		for(int i=0;i<Links.size();i++) {
			System.out.println(Links.get(i).getText());
			System.out.println(Links.get(i).getAttribute("href"));
		}
		
		driver.quit();

		
	}

}
