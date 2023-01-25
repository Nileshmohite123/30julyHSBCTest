package FindElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		//1
		List<WebElement> searchbox=driver.findElements(By.id("twotabsearchtextbox"));
		
		//searchbox.sendKeys("Oneplus");  sendkeys method not present in findlements
		
		List<WebElement> text=driver.findElements(By.xpath("//a[@class=\"nav-a  \"]"));
		
		for(WebElement ele:text) {
			System.out.println(ele.getText());
		}
		
		
		List<WebElement> links=driver.findElements(By.xpath("//a[@class=\"nav-assd  \"]"));
		System.out.println(links.size());  //Returns o -no exception
	}

}
