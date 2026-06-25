package DataproviderConcept.UtilityPackage;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtility_Step1 {
    public static Object[][] getExcelData() throws IOException {
        FileInputStream fis =
                new FileInputStream(System.getProperty("user.dir")+ File.separator+"TestData//Ecommerce_LogintestDataFie.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int rows = sheet.getLastRowNum();
        int columns = sheet.getRow(1).getLastCellNum();
        System.out.println(rows+"     Rows");
        System.out.println(columns+"       Columns");

        Object[][] data = new Object[rows][columns];

        for(int i = 1 ; i<=rows; i++){
            XSSFRow row =  sheet.getRow(i);
            for(int j =0; j<columns; j++){
                XSSFCell cell = row.getCell(j);
               // System.out.print(cell.toString()+"   ");
                data[i-1][j] = cell.toString();
            }
            System.out.println();

        }
        return data;
    }
}
