package SeleniumPhase1;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class Test35_DataDriven {
    static void main(String[] args) throws IOException {

        String projectPath = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(projectPath+"\\TestData\\TestDataFile.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int totalRows = sheet.getLastRowNum();
        int totalCells = sheet.getRow(1).getLastCellNum();
        System.out.println(totalRows+"TotalRows");
        System.out.println(totalCells+"TotalCells");


        // rows Counting from 0
        // Cells counting from 1

        for(int r = 0 ; r<=totalRows; r++){
            XSSFRow row = sheet.getRow(r);
            for(int c =0; c<totalCells; c++){
                XSSFCell cell = row.getCell(c);
                System.out.println(cell.toString());
            }
        }

        workbook.close();



    }
}
