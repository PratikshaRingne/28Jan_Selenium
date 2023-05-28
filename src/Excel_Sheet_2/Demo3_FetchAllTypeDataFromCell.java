package Excel_Sheet_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo3_FetchAllTypeDataFromCell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Desktop\\Selenium\\ExcelSheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		int lrn = sh.getLastRowNum();
		
		System.out.println(lrn);
		
		for(int i=0;i<=lrn;i++)
		{
			  Cell ceinfo = sh.getRow(i).getCell(0);
			  CellType type = ceinfo.getCellType();
			
			if(type==CellType.STRING)
			{
				String s1 = ceinfo.getStringCellValue();
				System.out.println(s1);
			}
			else if (type==CellType.NUMERIC )
			{
				double num = ceinfo.getNumericCellValue();
				System.out.println(num);
			}
			else if (type==CellType.BOOLEAN )
			{
				boolean bv = ceinfo.getBooleanCellValue();
				System.out.println(bv);
			}
			
			
		}
		
		
	}

}
