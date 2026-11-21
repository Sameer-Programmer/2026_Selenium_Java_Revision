
package DemoUtilityPackage_BestForLearningExcel_DataProvider_Test;

import org.testng.annotations.DataProvider;

import java.io.IOException;


public class Step002_ExcelDataProvider {

    @DataProvider(name = "LoginData")
    public Object[][] getLoginData() throws IOException {

        String path = System.getProperty("user.dir") + "//TestData//TestData.xlsx";
        Step001_ExcelUtility  xlutil = new Step001_ExcelUtility(path);

        int rows = xlutil.getRowCount("Sheet3");
        int columns = xlutil.getCellCount("Sheet3", 0);

        String[][] data = new String[rows][columns];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i - 1][j] =
                        xlutil.getCellData("Sheet3", i, j);

            }
        }

        return data;
    }
}
