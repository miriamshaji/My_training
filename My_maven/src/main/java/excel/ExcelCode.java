package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelCode {
public XSSFSheet sh;
	public ExcelCode() throws IOException
	
	{
		FileInputStream f=new FileInputStream("C:\\Users\\Miriam\\Desktop\\Book1.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
		

	}
	public String readData(int i, int j)
	{
		Row r= sh.getRow(i);
		Cell c=r.getCell(j);
		int celltype=c.getCellType();
		switch(celltype)
		{
		case Cell.CELL_TYPE_NUMERIC:
		{
			double q=c.getNumericCellValue();
			return String.valueOf(q);
		
		}
		case Cell.CELL_TYPE_STRING:
			
		{
			return c.getStringCellValue();
		}
	
		}
		return null;
	}
	public int rowSize()
	{
		int numberofrows=sh.getLastRowNum()+1;
		return numberofrows;
	}
}


