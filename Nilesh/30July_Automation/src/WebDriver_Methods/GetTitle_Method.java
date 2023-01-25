package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_Method {

	public static void main(String[] args) throws InterruptedException {
		
		// step-1
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
	
		//step-2
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		String Title=driver.getTitle();
		System.out.println(Title);
		
		String ExpectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
				
				if(Title.equals(ExpectedTitle)) {
					System.out.println("Correct title");
				}
				else {
					System.out.println("incorrect title");
				}
				driver.close();
	}

}
