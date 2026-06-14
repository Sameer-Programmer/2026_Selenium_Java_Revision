package Sameer_ReadFile;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {
    static void main(String[] args) throws IOException {
//        TestDataFile.xlsx
        String projectpath = System.getProperty("user.dir");
        FileInputStream file =
                new FileInputStream(projectpath + "\\TestData\\TestDataFile2.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheet("Sheet1");

        int rowsCount = sheet.getLastRowNum();
        System.out.println(rowsCount);
        int columnCellsCount = sheet.getRow(1).getLastCellNum();
        System.out.println(columnCellsCount);

        // Rows it alwas count from zero
        // but columns it count from 1
        /*
        // getLastRowNum() returns the last row index, not the total row count.
// Example: If there are 6 rows, indexes are 0 to 5, so getLastRowNum() returns 5.
// Therefore, use: for(int i = 0; i <= sheet.getLastRowNum(); i++)
         */

        for (int i = 0; i <= rowsCount; i++) {
            XSSFRow currentRow = sheet.getRow(i);
            for (int j = 0; j < columnCellsCount; j++) {
                XSSFCell currentCell = currentRow.getCell(j);
                System.out.print(currentCell.toString() + " ");
            }
            System.out.println();
        }
        wb.close();
        file.close();

    }
}
