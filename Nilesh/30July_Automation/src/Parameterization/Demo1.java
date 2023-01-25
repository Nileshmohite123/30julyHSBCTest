package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1 {
	
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path="C:\\Users\\abc\\Desktop\\Emp.xlsx";
		
		FileInputStream File=new FileInputStream(path);
		
		double b=WorkbookFactory.create(File).getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue();
		System.out.println(b);
	}

}
