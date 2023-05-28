package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo15_FetchRowData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Desktop\\Selenium\\ExcelSheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		 int ci = sh.getRow(0).getLastCellNum();
		
		System.out.println(ci);
		
		
		for(int i=0;i<ci;i++)
		{
			String values = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.println(values);
		}
		
		
	}

}
