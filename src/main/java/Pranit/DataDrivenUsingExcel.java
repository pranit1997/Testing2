package Pranit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class DataDrivenUsingExcel {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C://Users/Academy/Downloads/Selenium Easy.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0); //providing sheet name
        //XSSFSheet Sheet = workbook.getSheetAt(3);
       int rowcount = sheet.getLastRowNum(); // return the row count
int colcount = sheet.getRow(0).getLastCellNum(); //returns column & cell count
    for (int i=0 ; i<=rowcount;i++) {
        XSSFRow currentrow = sheet.getRow(i); //focused on current row
        for (int j = 0; j < colcount; j++) {
            String value = currentrow.getCell(j).toString();  // Read the value from the cell


            System.out.print(" " + value);
        }
        System.out.println();
    }
    }
}
