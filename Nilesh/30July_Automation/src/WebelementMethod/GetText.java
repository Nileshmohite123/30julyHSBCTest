package WebelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String ExpectedResult="Facebook helps you connect and share with the people in your life.";
		Thread .sleep(2000);
		String Text=driver.findElement(By.xpath("//h2[contains(text(),\"Facebook helps you connect and share\")]")).getText();
		System.out.println(Text);
		
		if(Text.equals(ExpectedResult)) {
			System.out.println("correct result");
		}
		else {
			System.out.println("incorrect result");
		}
		driver.quit();
		
		
	}

}
