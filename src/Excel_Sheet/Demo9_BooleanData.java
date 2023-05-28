package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo9_BooleanData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Desktop\\Selenium\\ExcelSheet.xlsx");
		
		Workbook book = WorkbookFactory.create(file);
		
		Sheet sh = book.getSheet("Sheet1");
		
		Row rw = sh.getRow(6);
		
		Cell ce = rw.getCell(3);
		
		boolean value = ce.getBooleanCellValue();
		
		System.out.println(value);
		
	}

}
