package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;


public class ReadData3 {

	public static void main(String[] args) throws IOException {

		String Path="C:\\Users\\abc\\Downloads\\Untitled spreadsheet (1).xlsx";
		FileInputStream File=new FileInputStream(Path);
	
	   XSSFWorkbook work= new XSSFWorkbook(File);

	XSSFSheet Sheet=work.getSheet("Sheet2");
	
	int Row=Sheet.getLastRowNum();
	
	System.out.println(Row);
	int Cell=Sheet.getRow(1).getLastCellNum();
	
	System.out.println(Cell);
	
	for(int R=0;R<=Row;R++) {      //Row
		
		XSSFRow row=Sheet.getRow(R);
		//System.out.println(Sheet.getRowNum(4));
		for(int C=0;C<Cell;C++) {   //Cell
			
			XSSFCell cell=row.getCell(C);
			
			switch(cell.getCellType()) {
			
			case STRING:System.out.print(cell.getStringCellValue());break;
			
			case NUMERIC:System.out.print(cell.getNumericCellValue());break;
			
			case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
			
			default:System.out.print("Different type of data");
			}
			
			System.out.print(" | ");
			
			
			
		}
		
		System.out.println();
		
	}
	}

}
