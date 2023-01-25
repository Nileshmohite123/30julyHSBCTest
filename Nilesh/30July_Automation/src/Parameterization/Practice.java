package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		String Path="C:\\Users\\abc\\Downloads\\30JulyMorning.xlsx";
		FileInputStream File=new FileInputStream(Path);
		String Data=WorkbookFactory.create(File).getSheet("Sheet1").getRow(4).getCell(5).getStringCellValue();
	
	    System.out.println(Data);
	}

}
