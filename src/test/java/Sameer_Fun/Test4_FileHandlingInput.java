package Sameer_Fun;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test4 {
    static void main(String[] args) throws IOException {
        String pathOfFile = System.getProperty("user.dir");
        FileInputStream file =
                new FileInputStream(pathOfFile + "\\TestData\\TestDataFile2.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int totalRowsCount = sheet.getLastRowNum();
        System.out.println(totalRowsCount);
        int totalColumnCount = sheet.getRow(1).getLastCellNum();
        System.out.println(totalColumnCount);

        // Read and print Data

        for (int i = 0; i <= totalRowsCount; i++) {
            XSSFRow currentRow = sheet.getRow(i);
            for (int j = 0; j < totalColumnCount; j++) {
                   XSSFCell currentcell =  currentRow.getCell(j);
                System.out.print(currentcell.toString()+" ");
            }
            System.out.println();
            System.out.println();
        }


    }
}
