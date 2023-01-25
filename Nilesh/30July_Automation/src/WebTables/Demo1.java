package WebTables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "c:\\Installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebElement Example=driver.findElement(By.xpath("//h3[contains(text(),\"Example\")]"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView", Example);
		
		
		int Row=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr")).size();
		System.out.println(Row);
		
		int Column=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr//th")).size();
		System.out.println(Column);
		
		for(int i=2;i<=Row;i++) {
			for(int j=1;j<=Column;j++) {
				
			String text=driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+i+"]//td["+j+"]")).getText();			
		
			System.out.print(text+"|");
		}
			
			System.out.println();
		}
	}

}
