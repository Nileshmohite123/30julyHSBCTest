package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXPath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webmail.au.syrahost.com/");
		driver.findElement(By.xpath("/html/body/div/form/div/div/input")).sendKeys("mohitenilesh7522@gmail.com");
	}

}
