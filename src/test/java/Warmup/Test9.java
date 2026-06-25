package Warmup;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test9 {
    @Test
    public void m1() throws IOException {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ File.separator+"TestData//TestDataFile2.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int rows = sheet.getLastRowNum();
        int columns = sheet.getRow(1).getLastCellNum();
        System.out.println(rows+"     Rows");
        System.out.println(columns+"       Columns");

        for(int i = 0 ; i<=rows; i++){
          XSSFRow row =  sheet.getRow(i);
          for(int j =0; j<columns; j++){
              XSSFCell cell = row.getCell(j);
              System.out.print(cell.toString()+"   ");
          }
            System.out.println();

        }
    }
}
