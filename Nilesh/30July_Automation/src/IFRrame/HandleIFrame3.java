package IFRrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIFrame3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[2]")).click();
		
		WebElement Outerframe=driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(Outerframe);
		
		WebElement innerFrame=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerFrame);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Nilesh");

	   driver.switchTo().defaultContent();
	   driver.findElement(By.xpath("//a[@href=\"Index.html\"]")).click();
	}

}
