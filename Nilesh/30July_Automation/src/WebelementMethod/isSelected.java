package WebelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		boolean b=driver.findElement(By.xpath("//input[@value=\"Male\"]")).isSelected();
		System.out.println(b);
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		boolean b1=driver.findElement(By.xpath("//input[@value=\"Male\"]")).isSelected();
		System.out.println(b1);

	}

}
