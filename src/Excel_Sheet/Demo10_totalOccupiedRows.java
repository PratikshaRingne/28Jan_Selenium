package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo10_totalOccupiedRows 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
        FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Desktop\\Selenium\\ExcelSheet.xlsx");
		
	    int num = WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum()+1;
	    
	    System.out.println(num);
		
		
	}

}
