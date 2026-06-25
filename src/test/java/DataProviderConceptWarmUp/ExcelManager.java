package DataProviderConceptWarmUp;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelManager {

    public static Object[][] m1() throws IOException {
        String projectPath = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(projectPath+ File.separator+"src//test//java//DataProviderConceptWarmUp//Ecommerce_LogintestDataFie.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int rows = sheet.getLastRowNum();
        int columns = sheet.getRow(1).getLastCellNum();

        Object[][] data = new Object[rows][columns];

        for(int i = 1; i<=rows; i++){
           XSSFRow row =  sheet.getRow(i);
            for(int j =0; j<columns; j++){
            XSSFCell cell =  row.getCell(j);
            data[i-1][j] = cell.toString();
            }
        }
        return data;


    }


}
