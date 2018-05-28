package DataDrivenExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File f =new File("E:\\Book1.xlsx");
		FileInputStream fs =new FileInputStream(f);
		XSSFWorkbook wk =new XSSFWorkbook(fs);
		XSSFSheet s1   =wk.getSheet("Sheet1");
		XSSFRow   r1   =s1.getRow(0);
		XSSFCell  c1   =r1.getCell(0);
		System.out.println(c1.getStringCellValue());
		
		
		
		
		
		
		
		
	}

}
