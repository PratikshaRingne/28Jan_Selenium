package PRACTICE_EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample10_DataByVarifyingCellType 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Pratiksha\\Desktop\\Selenium\\ExcelSheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		Cell cellInfo = sh.getRow(1).getCell(0);
		
		CellType type =cellInfo .getCellType();
		
		if(type==CellType.STRING)
		{
			String str = cellInfo.getStringCellValue();
			System.out.println(str);
		}
		else if(type==CellType.NUMERIC)
		{
			double num = cellInfo.getNumericCellValue();
			System.out.println(num);
		}
		else if(type==CellType.BOOLEAN)
		{
			boolean bv = cellInfo.getBooleanCellValue();
			System.out.println(bv);
		}
		
		
	}

}
