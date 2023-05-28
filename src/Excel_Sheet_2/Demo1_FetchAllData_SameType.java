package Excel_Sheet_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1_FetchAllData_SameType 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Desktop\\Selenium\\ExcelSheet.xlsx");
		
	    Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
	    
	    int RowlastIndex = sh.getLastRowNum();
	    
	    
	    for(int i=0;i<=RowlastIndex;i++)
	    {
	    	short cellnum = sh.getRow(i).getLastCellNum();
	    	
	    	for(int j=0;j<cellnum;j++)
	    	{
	    		String values = sh.getRow(i).getCell(j).getStringCellValue();
	    		System.out.print(values+" ");
	    	}
	    	System.out.println();
	    }
		
	}

}
