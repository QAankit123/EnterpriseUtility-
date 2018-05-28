package DataDrivenExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteInExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File f =new File("E:\\Book1.xlsx");
		FileInputStream fs = new FileInputStream (f); // XSSFSheet s1 = wk.getSheet("Sheet1");
		XSSFWorkbook wk = new XSSFWorkbook(fs);
		XSSFSheet s1    = wk.getSheet("Sheet1");
		int x=s1.getPhysicalNumberOfRows();
		for(int i=0;i<x;i++)
		{
			XSSFRow   r1    =  s1.getRow(i);
			int y=r1.getPhysicalNumberOfCells();
			for(int j=0;j<y;j++)
			{
				XSSFCell  c1    = r1.getCell(j);
				System.out.print(c1.getStringCellValue()+" ");
			}
			System.out.println();
		}
		
		      
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
