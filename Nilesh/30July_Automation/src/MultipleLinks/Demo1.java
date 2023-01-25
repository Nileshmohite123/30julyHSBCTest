package MultipleLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws IOException  {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		List <WebElement>Links=driver.findElements(By.tagName("a"));
		int brokenlinks=0;
		for(WebElement links:Links) {
			
			String url=links.getAttribute("href");
			
			if(url==null || url.isEmpty()) {
				
				System.out.println(url+"url is empty");
				continue;
			}
			
			URL link=new URL(url);
			
			HttpURLConnection httpcode=(HttpURLConnection) link.openConnection();
			
			httpcode.connect();
			
			if(httpcode.getResponseCode()>=4000) {
				
				System.out.println(httpcode.getResponseCode()+url+"broken link");
				
				brokenlinks++;
				
			}
			
			else {
				System.out.println(httpcode.getResponseCode()+url+"valid link");
			}
			
			
		}
		
		System.out.println(brokenlinks);
		
		
	}

}
