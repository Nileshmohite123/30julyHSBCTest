package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ass1 {


	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream Path= new FileInputStream("C:\\Users\\abc\\Desktop\\Emp.xlsx");
	
	String Data=	WorkbookFactory.create(Path).getSheet("Sheet1").getRow(3).getCell(3).getStringCellValue();

	System.out.println(Data);
	}

}
