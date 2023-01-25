package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String Path="C:\\Users\\abc\\Downloads\\30JulyMorning.xlsx";
		FileInputStream File=new FileInputStream(Path);
		String Data=WorkbookFactory.create(File).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	
	    System.out.println(Data);
	}

}
