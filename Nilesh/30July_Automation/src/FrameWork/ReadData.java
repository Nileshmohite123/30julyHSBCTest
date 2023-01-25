package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData {

	public static void main(String[] args) throws IOException {

System.setProperty("webdriver.chrome.driver", "c://Installer//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	   
		
		driver.get("https://www.facebook.com/");
		
		
		FileInputStream File=new FileInputStream("C:\\Users\\abc\\Documents\\ReadData.xlsx");
		
		  XSSFWorkbook work= new XSSFWorkbook(File);

			XSSFSheet Sheet=work.getSheet("Sheet2");
			
			int Row=Sheet.getLastRowNum();
			
			System.out.println(Row);
			int Cell=Sheet.getRow(1).getLastCellNum();
			
			System.out.println(Cell);
			
			
			for(int R=1;R<=Row;R++) {
				XSSFRow row=Sheet.getRow(R);
				
					 
					
				//String cell=	row.getCell(C).toString();
					
					XSSFCell cell=row.getCell(0);
					
					System.out.print("|"+cell);
				
				System.out.println();
			}

			

	}

}
