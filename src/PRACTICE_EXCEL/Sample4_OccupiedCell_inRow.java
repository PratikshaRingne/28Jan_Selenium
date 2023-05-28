package PRACTICE_EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample4_OccupiedCell_inRow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Desktop\\Selenium\\ExcelSheet.xlsx");
		
		short Lastcell = WorkbookFactory.create(file).getSheet("Sheet4").getRow(3).getLastCellNum();
		
		System.out.println(Lastcell);
		
	}

}
