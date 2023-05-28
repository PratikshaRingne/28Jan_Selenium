package PRACTICE_EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample11_AllDiffDataFromCell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Desktop\\Selenium\\ExcelSheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
	
		
		int lastRowIndex = sh.getLastRowNum();
		
		for(int i=0;i<=lastRowIndex;i++)
		{
			CellType type = sh.getRow(i).getCell(0).getCellType();
			
			if(type==CellType.STRING)
			{
				String str = sh.getRow(i).getCell(0).getStringCellValue();
				System.out.println(str);
			}
			else if(type==CellType.NUMERIC)
			{
				double num = sh.getRow(i).getCell(0).getNumericCellValue();
				System.out.println(num);
			}
			else if(type==CellType.BOOLEAN)
			{
				boolean bv = sh.getRow(i).getCell(0).getBooleanCellValue();
				System.out.println(bv);
			}
			
			
			
		}
	}

}
