package PRACTICE_EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample12_AllDiffDataFromRow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Desktop\\Selenium\\ExcelSheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		short LastCell = sh.getRow(0).getLastCellNum();
		
		for(int i=0;i<LastCell;i++)
		{
			Cell cellInfo = sh.getRow(0).getCell(i);
			CellType type = cellInfo.getCellType();
			
			if(type==CellType.STRING)
			{
				String str = cellInfo.getStringCellValue();
				System.out.print(str+" ");
				
			}
			else if(type==CellType.NUMERIC)
			{
				double num = cellInfo.getNumericCellValue();
				System.out.print(num+" ");
				
			}
			else if(type==CellType.BOOLEAN)
			{
				boolean bv = cellInfo.getBooleanCellValue();
				System.out.print(bv+" ");
				
			}
			
		}
		
	}

}
