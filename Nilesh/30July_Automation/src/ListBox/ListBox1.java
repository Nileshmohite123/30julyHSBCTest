package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox1 {

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
		driver.findElement(By.xpath("//select[@id=\"day\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"10\"]")).click();
		driver.findElement(By.xpath("//select[@id=\"month\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"2\"]")).click();
		driver.findElement(By.xpath("//select[@id=\"year\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"2016\"]")).click();
		driver.findElement(By.xpath("//label[@class=\"_58mt\"]")).click();
		
	}

}
