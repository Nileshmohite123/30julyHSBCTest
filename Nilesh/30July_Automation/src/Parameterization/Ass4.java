package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ass4 {

	public static void main(String[] args) throws IOException {

FileInputStream Path= new FileInputStream("C:\\Users\\abc\\Desktop\\Emp.xlsx");
		
		XSSFWorkbook work=new XSSFWorkbook(Path);
		
		XSSFSheet Sheet=work.getSheet("Sheet1");
		
		int Row=Sheet.getLastRowNum();
		System.out.println(Row);
		
		int Cell=Sheet.getRow(0).getLastCellNum();
		
	System.out.println(Cell);
	
	
	for(int R=0;R<=Row;R++) {
		XSSFRow row=Sheet.getRow(R);
		
		for(int C=0;C<Cell;C++) {
			 
			
		//String cell=	row.getCell(C).toString();
			
			XSSFCell cell=row.getCell(C);
			
			if(R<=Row) {
				System.out.print(cell);
			}
			else {
				System.out.print(" ");
			}
			System.out.print("|");
			}
		System.out.println();
		
	}
	

	}}
