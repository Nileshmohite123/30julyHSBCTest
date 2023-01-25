package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String Path="C:\\Users\\abc\\Downloads\\Untitled spreadsheet.xlsx";
		FileInputStream File=new FileInputStream(Path);
		
		Double Data=WorkbookFactory.create(File).
				getSheetAt(0).
				
			//getSheet("Sheet1").
			getRow(1).getCell(1).
			getNumericCellValue();
	
	   System.out.println(Data);
	}

}
