package excel;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelCode e=new ExcelCode();
		for(int i=0;i<e.rowSize();i++)
		{
			for(int j=0;j<3;j++)
			{
				String st=e.readData(i, j);
				System.out.println("value of cell is "+st);
			}
		}
		
	}

}
