package Pranit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writingdataintoexcel {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("C://Users/Academy/Desktop/Writing Data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet1 = workbook.createSheet("Data");
        for (int i =0; i<=5; i++)
        {
            XSSFRow row1 = sheet1.createRow(i);
            for (int j=0; j<=3 ; j++)
            {row1.createCell(0).setCellValue("abc");
                row1.createCell(1).setCellValue("xyz");
                row1.createCell(2).setCellValue("aqw");
                row1.createCell(3).setCellValue("ert");
            }
        }
  workbook.write(file);
        file.close();


    }


}
