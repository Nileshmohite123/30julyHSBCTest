package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {

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
        //step2
		
		//1.select element using select by visible text
	//	Select select1=new Select(Day);
	//    select1.selectByVisibleText("10");
	//	Select select2=new Select(Month);
	//	select2.selectByVisibleText("May");
	//	Select select3=new Select(Year);
	//	select3.selectByVisibleText("1995");
		
		//2.select by value
	//	Select select4=new Select(Day);
	//	select4.selectByValue("10");
	///	Select select5=new Select(Month);
	//	select5.selectByValue("5");
	///	Select select6=new Select(Year);
	//	select6.selectByValue("2002");
		
		//3.select by index
		Select select7=new Select(Day);
		select7.selectByIndex(12);
		Select select8=new Select(Month);
		select8.selectByIndex(4);
		Select select9=new Select(Year);
		select9.selectByIndex(7);
		
		


		
	}

}
