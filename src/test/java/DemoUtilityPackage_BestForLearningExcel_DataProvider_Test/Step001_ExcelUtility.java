
package DemoUtilityPackage_BestForLearningExcel_DataProvider_Test;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Step001_ExcelUtility {

    // 1. Declare variables

    public FileInputStream fi;
    public FileOutputStream fo;
    public XSSFWorkbook wb;
    public XSSFSheet ws;
    public XSSFRow row;
    public XSSFCell cell;
    public CellStyle style;
    String path;

    // 2. Constructor - Initialize Excel file path
    public Step001_ExcelUtility(String path) {
        this.path = path;
    }


    // 3. Get total row count from Excel sheet
    public int getRowCount(String sheetName) throws IOException {
        fi = new FileInputStream(path);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(sheetName);
        int rowcount = ws.getLastRowNum();
        wb.close();
        fi.close();
        return rowcount;
    }


    // 4. Get total column count from a particular row

    public int getCellCount(String sheetName, int rownum) throws IOException {
        fi = new FileInputStream(path);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(sheetName);
        row = ws.getRow(rownum);
        int cellcount = row.getLastCellNum();
        wb.close();
        fi.close();
        return cellcount;

    }

    // 5. Get data from a particular cell

    public String getCellData(String sheetName, int rownum, int colnum) throws IOException {

        fi = new FileInputStream(path);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(sheetName);
        row = ws.getRow(rownum);
        cell = row.getCell(colnum);
        DataFormatter formatter = new DataFormatter();
        String data;
        try {
            data = formatter.formatCellValue(cell);
        } catch (Exception e) {
            data = "";
        }
        wb.close();
        fi.close();
        return data;
    }


    // 6. Write data into a particular Excel cell

    public void setCellData(String sheetName, int rownum, int colnum, String data) throws IOException {

        File xlfile = new File(path);

        // Check whether Excel file exists

        if (!xlfile.exists()) {

            wb = new XSSFWorkbook();

            fo = new FileOutputStream(path);

            wb.write(fo);

            wb.close();
            fo.close();

        }


        // Open existing Excel file

        fi = new FileInputStream(path);

        wb = new XSSFWorkbook(fi);


        // Check whether sheet exists; create if not available

        if (wb.getSheetIndex(sheetName) == -1) {

            wb.createSheet(sheetName);

        }

        ws = wb.getSheet(sheetName);


        // Check whether row exists; create if not available

        if (ws.getRow(rownum) == null) {

            ws.createRow(rownum);

        }


        // Create cell and insert data

        row = ws.getRow(rownum);

        cell = row.createCell(colnum);

        cell.setCellValue(data);


        // Save updated workbook

        fo = new FileOutputStream(path);

        wb.write(fo);


        // Close resources

        wb.close();
        fi.close();
        fo.close();

    }

}
