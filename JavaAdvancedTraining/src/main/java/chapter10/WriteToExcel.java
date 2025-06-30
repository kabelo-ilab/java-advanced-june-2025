package chapter10;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class WriteToExcel {
    public static void main(String[] args) {
        String filepath = "D:\\Java projects\\modules.xlsx";

        try {
            OutputStream fileOutput = new FileOutputStream(filepath);
            XSSFWorkbook wb = new XSSFWorkbook();
            XSSFSheet sheet = wb.createSheet("iLAB Modules");
            //create the header row
            XSSFRow header = sheet.createRow(0);
            header.createCell(0).setCellValue("Module");
            header.createCell(1).setCellValue("Credits");
            //create row 1
            XSSFRow row1 = sheet.createRow(1);
            row1.createCell(0).setCellValue("Java");
            row1.createCell(1).setCellValue(120);
            //create row 2
            XSSFRow row2 = sheet.createRow(2);
            row2.createCell(0).setCellValue("SQL");
            row2.createCell(1).setCellValue(100);
            //create row 3
            XSSFRow row3 = sheet.createRow(3);
            row3.createCell(0).setCellValue("PST");
            row3.createCell(1).setCellValue(85);

            wb.write(fileOutput);
            fileOutput.close();
            wb.close();

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }
    }
}
