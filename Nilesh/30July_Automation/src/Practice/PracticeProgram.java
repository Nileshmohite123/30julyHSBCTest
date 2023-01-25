package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeProgram {

	public static void main(String[] args)   {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
				WebElement element=driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
				
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView", element);
				
				int Row=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
				System.out.println(Row);
				
				int Col=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
				System.out.println(Col);
				
				for(int i=2;i<=Row;i++) {
					for(int j=1;j<=Col;j++) {
					String Data=	driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.print(Data+"|");
					}
					
					System.out.println();
					
				}
				driver.quit();
				
	}

}
