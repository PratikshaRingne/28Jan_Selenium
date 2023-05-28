package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo12_FetchRowData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
        
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Desktop\\Selenium\\ExcelSheet.xlsx");
		 
		   Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		   
		   int ci = sh.getRow(1).getLastCellNum();
		 
		 for(int i=0;i<ci;i++)
		 {
			  String values = sh.getRow(1).getCell(i).getStringCellValue();
			  System.out.print(values+" ");
		 }
		
	}

}
