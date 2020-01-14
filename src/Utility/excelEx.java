package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelEx {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException 
	{
		//File object for setting the absolute path of xls
		File f= new File("D:\\Students Archive\\PageObjects.xlsx");
		
		//setting the file path for reading
		FileInputStream fis = new FileInputStream(f);
		
		//setting the workbook for reading the absolute path
		XSSFWorkbook WB = new XSSFWorkbook(fis);
		
		XSSFSheet ws = WB.getSheet("Testforopen");
		
		String str = ws.getRow(2).getCell(2).getStringCellValue();
		
		System.out.println("Value in 2row and 2nd col " + str);
		
	}

}
