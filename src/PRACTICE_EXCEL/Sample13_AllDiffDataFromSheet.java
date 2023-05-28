package PRACTICE_EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample13_AllDiffDataFromSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Desktop\\Selenium\\ExcelSheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		int lastRowIndex = sh.getLastRowNum();
		
		for(int i=0;i<=lastRowIndex;i++)
		{
			short lastCell = sh.getRow(i).getLastCellNum();
			
			for(int j=0;j<lastCell;j++)
			{
				Cell CellInfo = sh.getRow(i).getCell(j);
				CellType type =CellInfo.getCellType();
				
				if(type==CellType.STRING)
				{
					String value = CellInfo.getStringCellValue();
					System.out.print(value+"  ");
				}
				else if(type==CellType.NUMERIC)
				{
					double value = CellInfo.getNumericCellValue();
					System.out.print(value+"  ");
				}
				else if(type==CellType.BOOLEAN)
				{
					boolean value = CellInfo.getBooleanCellValue();
					System.out.print(value+"  ");
				}
				  
			}
			System.out.println();
		}
		
		
	}

}
