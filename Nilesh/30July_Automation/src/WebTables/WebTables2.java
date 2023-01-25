package WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables2 {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "c://Installer//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		String BaseUrl="https://www.w3schools.com/html/html_tables.asp";
		driver.get(BaseUrl);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement example=driver.findElement(By.xpath("//h3[contains(text(),'Example')]"));
		
		js.executeScript("arguments[0].scrollIntoView;", example);
		
		//First way
		//How many rows in the table
		
		int Row=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
		
		System.out.println("Total no.of rows are:"+Row);
		
		// How many columns in the table
		
		int Col=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		
		System.out.println("Total no.of columns are:"+Col);
		
		List<WebElement> Col1=driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
		System.out.println("Total no.of columns are:"+Col1.size());
		
		
		//Retrive the specific row/col data
		
	String Data=	driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[4]/td[3]")).getText();
		System.out.println(Data);
		
		String Data1=	driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[3]/td[2]")).getText();
		System.out.println(Data1);
		
		//Retrive all the data from the table
		
		for(int i=2;i<=Row;i++) {
			
			for(int j=1;j<=Col;j++) {
				
			String ActualValue=	driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
				
			if (ActualValue.equals("Canada")) {
				
				System.out.println("Row no.:"+i+"col no.:"+j);
				break;
			}
				
			}
			
			System.out.println();
		}
		
		driver.quit();
	}

}
