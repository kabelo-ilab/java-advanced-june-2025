package chapter10;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {
    public static void main(String[] args) {
        String filepath = "D:\\Java projects\\Cities.xlsx";

        try {
            FileInputStream fileInput = new FileInputStream(filepath);
            XSSFWorkbook wb = new XSSFWorkbook(fileInput);
            XSSFSheet sheet = wb.getSheetAt(0);

            for (Row myRow : sheet){
                //row
                for (Cell myCell : myRow){
                    //cell
                    switch (myCell.getCellType()){
                        case NUMERIC -> System.out.print(myCell.getNumericCellValue() + "\t\t\t");
                        case STRING -> System.out.print(myCell.getStringCellValue() + "\t\t\t");
                        default -> System.out.println("Invalid cell type");
                    }

//                    if (myCell.getCellType() == CellType.STRING){
//                        System.out.print(myCell.getStringCellValue() + "\t\t\t");
//                    } else if (myCell.getCellType() == CellType.NUMERIC) {
//                        System.out.print(myCell.getNumericCellValue() + "\t\t\t");
//                    }
                }
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
