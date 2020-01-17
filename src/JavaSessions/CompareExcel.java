package JavaSessions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CompareExcel {
    static Boolean check = false;

    @SuppressWarnings("resource")
	public static void main(String args[]) throws IOException
    {
        try 
        {

            ArrayList arr1 = new ArrayList();
            ArrayList arr2 = new ArrayList();
            ArrayList arr3 = new ArrayList();

            FileInputStream file1 = new FileInputStream(new File("D:\\DB_Framework\\Excel\\ExcelOne.xlsx"));

            FileInputStream file2 = new FileInputStream(new File("D:\\DB_Framework\\Excel\\ExcelTwo.xlsx"));

            // Get the workbook instance for XLS file
            XSSFWorkbook workbook1 = new XSSFWorkbook(file1);
            XSSFWorkbook workbook2 = new XSSFWorkbook(file2);

            // Get first sheet from the workbook
            XSSFSheet sheet1 = workbook1.getSheetAt(0);
            XSSFSheet sheet2 = workbook2.getSheetAt(0);
            
             // Compare sheets

            // Get iterator to all the rows in current sheet1
            Iterator<Row> rowIterator1 = sheet1.iterator();
            Iterator<Row> rowIterator2 = sheet2.iterator();

            while (rowIterator1.hasNext()) {
                Row row = rowIterator1.next();
                // For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
                
                while (cellIterator.hasNext()) {

                    Cell cell = cellIterator.next();

                             switch (cell.getCellType()) 
                        {
	                        case NUMERIC:
	                            System.out.print(cell.getNumericCellValue());
	                            arr1.add(cell.getNumericCellValue());
	                            break;
	                        case STRING:
	                            arr1.add(cell.getStringCellValue());
	                            System.out.print(cell.getStringCellValue());
	                            break;
	                        case BOOLEAN:
	                            arr1.add(cell.getBooleanCellValue());
	                            System.out.print(cell.getBooleanCellValue());
	                            break;
                        }

              

                }

                System.out.println(" ");
            }

            file1.close();

            System.out.println("-----------------------------------");
            // For retrive the second excel data
            while (rowIterator2.hasNext()) {
                Row row1 = rowIterator2.next();
                // For each row, iterate through all the columns
                Iterator<Cell> cellIterator1 = row1.cellIterator();

                while (cellIterator1.hasNext()) {

                    Cell cell1 = cellIterator1.next();
                        switch (cell1.getCellType()) 
                      {
	                        case NUMERIC:
	                            arr2.add(cell1.getNumericCellValue());
	                            System.out.print(cell1.getNumericCellValue());
	                            break;
	                        case STRING:
	                            arr2.add(cell1.getStringCellValue());
	                            System.out.print(cell1.getStringCellValue());
	                            break;
	                        case BOOLEAN:
	                            arr2.add(cell1.getBooleanCellValue());
	                            System.out.print(cell1.getBooleanCellValue());
	                            break;
                        }

                }

                System.out.println("");
            }

             // compare two arrays
            for (Object value : arr1) 
            {
                if (!arr2.contains(value))
                {
                    arr3.add(value);
                }
            }
            
            System.out.println("Final list values - = - = + " + arr3);
            writeStudentsListToExcel(arr3);

            // closing the files
            file1.close();
            file2.close();

        } 
        catch (FileNotFoundException e) 
	    {
	        e.printStackTrace();
	    }
        catch (IOException e) 
	    {
            e.printStackTrace();
        }

    }

    // write into new file excel

    private static void writeStudentsListToExcel(ArrayList arr3) 
    {

        FileOutputStream fos = null;
        try 
        {
            fos = new FileOutputStream("D:\\DB_Framework\\Excel\\Result.xlsx");

            XSSFWorkbook workBook = new XSSFWorkbook();
            XSSFSheet spreadSheet = workBook.createSheet("email");
            XSSFRow row;
            XSSFCell cell;
            // System.out.println("array size is :: "+minusArray.size());
            int cellnumber = 0;
            for (int i1 = 0; i1 < arr3.size(); i1++) 
            {
                row = spreadSheet.createRow(i1);
                cell = row.createCell(cellnumber);
                // System.out.print(cell.getCellStyle());
                cell.setCellValue(arr3.get(i1).toString().trim());
            }
            workBook.write(fos);
        }
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    // end -write into new file
}

